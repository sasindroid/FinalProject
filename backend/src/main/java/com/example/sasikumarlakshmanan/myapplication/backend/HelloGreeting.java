package com.example.sasikumarlakshmanan.myapplication.backend;

/**
 * Created by sasikumarlakshmanan on 23/04/16.
 */
public class HelloGreeting {

    public String message;

    public HelloGreeting() {};

    public HelloGreeting(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
