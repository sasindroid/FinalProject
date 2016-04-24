package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;

import com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.JokeApi;
import com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by sasikumarlakshmanan on 23/04/16.
 */
public class EndpointsGetJokesAsyncTask extends AsyncTask<Void, Void, String[]> {

    OnJokesTaskCompleteHandler onJokesTaskCompleteHandler;

    public interface OnJokesTaskCompleteHandler {
        public void onJokesTaskComplete(String[] jokesStrArr);
    }

    private static final String TAG = "EndpointsGetJokesAsyncTask";
    private static JokeApi myJokeService = null;
    private Activity activity;

//    EndpointsGetJokesAsyncTask(Activity activity) {
//        this.activity = activity;
//    }

    public EndpointsGetJokesAsyncTask(OnJokesTaskCompleteHandler onJokesTaskCompleteHandler) {
        this.onJokesTaskCompleteHandler = onJokesTaskCompleteHandler;
    }

    /**
     * Override this method to perform a computation on a background thread. The
     * specified parameters are the parameters passed to {@link #execute}
     * by the caller of this task.
     * <p/>
     * This method can call {@link #publishProgress} to publish updates
     * on the UI thread.
     *
     * @param params The parameters of the task.
     * @return A result, defined by the subclass of this task.
     * @see #onPreExecute()
     * @see #onPostExecute
     * @see #publishProgress
     */
    @Override
    protected String[] doInBackground(Void... params) {

        if (myJokeService == null) {  // Only do this once

            // After deploying to cloud backend
            JokeApi.Builder builder = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://YOUR_PROJECT_ID.appspot.com/_ah/api/");

            myJokeService = builder.build();
        }

        try {

            List<Joke> jokes = myJokeService.getJokesList().execute().getItems();

            Log.d(TAG, "RESULT: " + (jokes != null ? jokes.size() : "NULL"));

            String[] jokesStrArr = null;

            if (jokes != null && jokes.size() > 0) {

                jokesStrArr = new String[jokes.size()];

                for (int i = 0; i < jokes.size(); i++) {
                    jokesStrArr[i] = jokes.get(i).getJokeStr();
                }
            }

            return jokesStrArr;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    protected void onPostExecute(String[] jokesStrArr) {


        // Pass the Jokes from GCE to the Android Library to display those Jokes.
        onJokesTaskCompleteHandler.onJokesTaskComplete(jokesStrArr);
    }
}
