package com.example.spring5jokesappv2;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Spring5JokesAppV2ApplicationTests {

    @Autowired
    ChuckNorrisQuotes cnc;

    @Test
    void contextLoads() {
    }

    @Test
    public void generateJoke(){
        System.out.println("Joke ----->>>> " + cnc.getRandomQuote());
        System.out.println(" End of Joke");
    }
}
