package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.util.Log;

import com.example.sasikumarlakshmanan.myapplication.backend.myApi.MyApi;
import com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.Quote2Api;
import com.example.sasikumarlakshmanan.myapplication.backend.quote2Api.model.Quote2;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;

import java.io.IOException;

/**
 * Created by sasikumarlakshmanan on 22/04/16.
 */
public class EndpointsQuote2InsertAsyncTask extends AsyncTask<Void, Void, Void> {

    private static final String TAG = "EndpointsAsyncTask";
    private static MyApi myApiService = null;
    private static Quote2Api myQuote2Service = null;
    private Context context;

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected Void doInBackground(Void... params) {

        if (myApiService == null) {  // Only do this once

            // After deploying to cloud backend
            Quote2Api.Builder builder = new Quote2Api.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                    .setRootUrl("https://udacitybuiltitbigger-1289.appspot.com/_ah/api/");

            myQuote2Service = builder.build();

            Quote2 quote2 = new Quote2();
            quote2.setId(3);
            quote2.setAuthor("Sasi");
            quote2.setMessage("Keep well, smile well!");

            try {
                myQuote2Service.insertQuote2(quote2).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
    }
}