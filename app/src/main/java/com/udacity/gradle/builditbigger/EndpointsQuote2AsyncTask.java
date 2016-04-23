package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.util.Log;
import android.widget.Toast;

import com.example.sasikumarlakshmanan.myapplication.backend.myApi.MyApi;
import com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.Quote2Api;
import com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;
import java.util.List;

/**
 * Created by sasikumarlakshmanan on 22/04/16.
 */
public class EndpointsQuote2AsyncTask extends AsyncTask<Pair<Context, String>, Void, List<Quote2>> {
    private static final String TAG = "EndpointsAsyncTask";
    private static MyApi myApiService = null;
    private static Quote2Api myQuote2Service = null;
    private Context context;

    @Override
    protected List<Quote2> doInBackground(Pair<Context, String>... params) {
        if (myApiService == null) {  // Only do this once

            // After deploying to cloud backend
            Quote2Api.Builder builder = new Quote2Api.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://udacitybuiltitbigger-1289.appspot.com/_ah/api/");

            myQuote2Service = builder.build();
        }

        try {

            List<Quote2> quotesList = myQuote2Service.getQuotesList().execute().getItems();

            return quotesList;
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    protected void onPostExecute(List<Quote2> quote2List) {
//        Toast.makeText(context, result, Toast.LENGTH_LONG).show();

        Log.d(TAG, "RESULT: " + (quote2List != null ? "SIZE: " + quote2List.size() : "NULL"));
    }
}
