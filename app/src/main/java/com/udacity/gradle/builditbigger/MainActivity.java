package com.udacity.gradle.builditbigger;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.JokeClass;


public class MainActivity extends ActionBarActivity {

    public static final String JOKES_ARRAY = "JOKES_ARRAY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void tellJokes(View view){

        // Get the jokes from Java Library.
        String[] jokes = new JokeClass().getJokes();

        // Pass the Jokes from Java Library to GCE.
        new EndpointsInsertJokeAsyncTask(this, jokes).execute();
    }

    public void getJokes(View view) {

        new EndpointsGetJokesAsyncTask(this).execute();
    }

    public void deleteJokes(View view) {

        new EndpointsDeleteJokesAsyncTask(this).execute();
    }


}
