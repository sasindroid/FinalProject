package com.udacity.gradle.builditbigger;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.JokeClass;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.sasi.jokeandroidlib.DisplayJokes;


public class MainActivity extends ActionBarActivity implements EndpointsGetJokesAsyncTask.OnJokesTaskCompleteHandler {

    public static final String JOKES_ARRAY = "JOKES_ARRAY";

    ProgressDialog dialog;
    InterstitialAd mInterstitialAd;
    String[] jokesStrArr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Refer: https://developers.google.com/admob/android/interstitial#adding_interstitial_ads_to_an_activity
        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getResources().getString(R.string.banner_ad_unit_id));

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();
                showJokes();
            }
        });

        requestNewInterstitial();
    }

    // Test this on an emulator to see the Interstitial ad.
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();

        mInterstitialAd.loadAd(adRequest);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJokes(View view) {

        // Get the jokes from Java Library.
        String[] jokes = new JokeClass().getJokes();

        // Pass the Jokes from Java Library to GCE.
        new EndpointsInsertJokeAsyncTask(this, jokes).execute();
    }

    public void getJokes(View view) {

        showProgress(getString(R.string.progress_get_jokes));
        new EndpointsGetJokesAsyncTask(this).execute();
    }

    public void deleteJokes(View view) {

        new EndpointsDeleteJokesAsyncTask(this).execute();
    }

    @Override
    public void onJokesTaskComplete(String[] jokesStrArr) {

        stopProgress();

        this.jokesStrArr = jokesStrArr;

        showJokes();
    }

    private void showJokes() {

        // Show Interstitial Ad if loaded.
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
        } else {

            // Pass the Jokes from GCE to the Android Library to display those Jokes.
            Intent jokeIntent = new Intent(this, DisplayJokes.class);

            Bundle jokesBundle = new Bundle();
            jokesBundle.putStringArray(MainActivity.JOKES_ARRAY, jokesStrArr);

            jokeIntent.putExtras(jokesBundle);

            this.startActivity(jokeIntent);
        }
    }

    public void showProgress(String str) {
        dialog = new ProgressDialog(this);
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
