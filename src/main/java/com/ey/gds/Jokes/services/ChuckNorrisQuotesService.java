package com.ey.gds.Jokes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuotesService {
    private final ChuckNorrisQuotes chuckNorris;

    public ChuckNorrisQuotesService() {
        this.chuckNorris = new ChuckNorrisQuotes();
    }

    public String getQuote() {
        return chuckNorris.getRandomQuote();
    }

}
