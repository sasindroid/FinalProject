package com.example;

public class JokeClass {

    String[] jokes = {"That awkward moment when you leave a store without buying anything and all you can think is \"act natural, you're innocent\".",
            "I think my neighbor is stalking me as she's been googling my name on her computer. I saw it through my telescope last night.",
            "Today a man knocked on my door and asked for a small donation towards the local swimming pool. I gave him a glass of water.",
            "I changed my password to \"incorrect\". So whenever I forget what it is the computer will say \"Your password is incorrect\"."};


    public String getJoke() {
        return "Q: Why did the boy bring a ladder to school?\n" +
                "A: He wanted to go to high school.";
    }

    public String[] getJokes() {
        return jokes;
    }
}
