package com.example.sasikumarlakshmanan.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.response.NotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "jokeApi",
        version = "v1",
        resource = "joke",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.sasikumarlakshmanan.example.com",
                ownerName = "backend.myapplication.sasikumarlakshmanan.example.com",
                packagePath = ""
        )
)
public class JokeEndpoint {

    private static final Logger logger = Logger.getLogger(JokeEndpoint.class.getName());

    public static List<Joke> jokes = new ArrayList<Joke>();

    /**
     * This method gets the <code>Joke</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Joke</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getJoke")
    public Joke getJoke(@Named("id") Long id) {

        /* NOT USED */

        logger.info("Calling getJoke method");
        return null;
    }

    /**
     * This inserts a new <code>Joke</code> object.
     *
     * @param joke The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertJoke")
    public Joke insertJoke(Joke joke) throws NotFoundException {

        logger.info("Calling insertJoke method");

        boolean isJokePresent = false;

        // Check if the quote already exists.
        for (Joke jokeObj : jokes) {

            String jokeStr = jokeObj.getJokeStr();
            String jokeStrIn = joke.getJokeStr();

            if (jokeStrIn.compareToIgnoreCase(jokeStr) == 0) {
                isJokePresent = true;
                break;
            }
        }

        if (!isJokePresent) {
            jokes.add(joke);
        }

        return joke;
    }

    /**
     * This method gets the list of Jokes.
     *
     * @return The List of Joke objects to be added.
     */
    @ApiMethod(name = "getJokesList")
    public List<Joke> getJokesList() {
        return jokes;
    }

    /**
     * This method deletes all the Jokes from GCE.
     */
    @ApiMethod(name = "deleteAllJokes")
    public void deleteAllJokes() {

        jokes.clear();
    }
}