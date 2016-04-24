package com.udacity.gradle.builditbigger;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.sasikumarlakshmanan.myapplication.backend.jokeApi.JokeApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by sasikumarlakshmanan on 23/04/16.
 */
public class EndpointsDeleteJokesAsyncTask extends AsyncTask<Void, Void, Void> {

    private static final String TAG = "EndpointsDeleteJokesAsyncTask";
    private static JokeApi myJokeService = null;
    private Activity activity;
    ProgressDialog dialog;

    public EndpointsDeleteJokesAsyncTask(Activity activity) {
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {

        showProgress(activity.getResources().getString(R.string.progress_delete_jokes));
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
    protected Void doInBackground(Void... params) {

        if (myJokeService == null) {  // Only do this once

            // After deploying to cloud backend
            JokeApi.Builder builder = new JokeApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://udacitybuiltitbigger-1289.appspot.com/_ah/api/");

            myJokeService = builder.build();
        }

        try {

            myJokeService.deleteAllJokes().execute();

            return null;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    protected void onPostExecute(Void params) {

        stopProgress();

        Toast.makeText(activity, R.string.jokes_deleted, Toast.LENGTH_SHORT).show();
    }

    public void showProgress(String str) {
        dialog = new ProgressDialog(activity);
        dialog.setMessage(str);
        dialog.setCanceledOnTouchOutside(false);
        dialog.show();
    }

    public void stopProgress() {
        if (dialog != null && dialog.isShowing()) {
            dialog.dismiss();
        }
    }
}
