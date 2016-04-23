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
        name = "quote2Api",
        version = "v1",
        resource = "quote2",
        namespace = @ApiNamespace(
                ownerDomain = "backend.myapplication.sasikumarlakshmanan.example.com",
                ownerName = "backend.myapplication.sasikumarlakshmanan.example.com",
                packagePath = ""
        )
)
public class Quote2Endpoint {

    private static final Logger logger = Logger.getLogger(Quote2Endpoint.class.getName());

    public static List<Quote2> quotes = new ArrayList<Quote2>();

    /**
     * This method gets the <code>Quote2</code> object associated with the specified <code>id</code>.
     *
     * @param id The id of the object to be returned.
     * @return The <code>Quote2</code> associated with <code>id</code>.
     */
    @ApiMethod(name = "getQuote2")
    public Quote2 getQuote2(@Named("id") Long id) {

        logger.info("Calling getQuote2 method");

        return null;
    }

    /**
     * This inserts a new <code>Quote2</code> object.
     *
     * @param quote2 The object to be added.
     * @return The object to be added.
     */
    @ApiMethod(name = "insertQuote2")
    public Quote2 insertQuote2(Quote2 quote2) throws NotFoundException {

        logger.info("Calling insertQuote2 method");

        // Check if the quote already exists.
        int index = quotes.indexOf(quote2);

        // If not -1 the Quote already exist.
        if(index != -1) {
            logger.info("Quote already exists, so not inserting.");
            throw new NotFoundException("Quote already exists");
        }

        quotes.add(quote2);

        return quote2;
    }

    @ApiMethod(name = "getQuotesList")
    public List<Quote2> getQuotesList() {
        return quotes;
    }
}