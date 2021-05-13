package com.example.spring5jokesappv2.jokes;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeService(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
