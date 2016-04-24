package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

import java.util.concurrent.ExecutionException;

/**
 * Created by sasikumarlakshmanan on 24/04/16.
 */
public class JokesTest extends AndroidTestCase {

    public void testJokesAsyncTask() {

        EndpointsGetJokesAsyncTask endpointsGetJokesAsyncTask = new EndpointsGetJokesAsyncTask(new EndpointsGetJokesAsyncTask.OnJokesTaskCompleteHandler() {
            @Override
            public void onJokesTaskComplete(String[] jokesStrArr) {

            }
        });

        String[] jokesStrArr = null;

        try {
            jokesStrArr = endpointsGetJokesAsyncTask.execute().get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        assertNotNull("Jokes fetched from server is null!", jokesStrArr);
        assertTrue("Jokes count fetched from server!", jokesStrArr.length > 0);
    }

}