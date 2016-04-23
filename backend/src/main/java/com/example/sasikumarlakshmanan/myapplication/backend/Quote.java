package com.example.sasikumarlakshmanan.myapplication.backend;

/**
 * Created by sasikumarlakshmanan on 23/04/16.
 */
public class Quote {

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getWhom() {
        return whom;
    }

    public void setWhom(String whom) {
        this.whom = whom;
    }

    Long id;
    String who;
    String whom;
}
