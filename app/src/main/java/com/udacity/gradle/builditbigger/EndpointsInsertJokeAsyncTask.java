package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.JokeApi;
import com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.model.Joke;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by sasikumarlakshmanan on 23/04/16.
 */
public class EndpointsInsertJokeAsyncTask extends AsyncTask<Void, Void, Integer> {

    private static final String TAG = "EndpointsInsertJokeAsyncTask";
    private static JokeApi myJokeService = null;
    private Activity activity;
    String[] jokes;

    EndpointsInsertJokeAsyncTask(Activity activity, String[] jokes) {
        this.activity = activity;
        this.jokes = jokes;
    }

    @Override
    protected void onPreExecute() {

        if (jokes == null || jokes.length == 0) {
            cancel(true);
        }
    }

    /**
     * Override this method to perform a computation on a background thread. The
     * specified parameters are the parameters passed to {@link #execute}
     * by the caller of this task.
     * <p>
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
    protected Integer doInBackground(Void... params) {

        if (myJokeService == null) {  // Only do this once

            // After deploying to cloud backend
            JokeApi.Builder builder = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://udacitybuiltitbigger-1289.appspot.com/_ah/api/");

            myJokeService = builder.build();
        }

        int jokesCnt = 0;

        // Insert a couple of jokes for this test project.
        for (String jokeStr : jokes) {

            Joke joke = new Joke();
            joke.setJokeStr(jokeStr);

            try {
                myJokeService.insertJoke(joke).execute();

                ++jokesCnt;

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return jokesCnt;
    }

    @Override
    protected void onPostExecute(Integer jokesCnt) {

        if (jokesCnt > 0) {
            Toast.makeText(activity, R.string.jokes_added, Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCancelled() {

        Toast.makeText(activity, R.string.no_jokes_passed, Toast.LENGTH_SHORT).show();

        super.onCancelled();

    }
}
