package com.example.spring5jokesappv2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@SpringBootApplication
public class Spring5JokesAppV2Application {

    public static void main(String[] args) {
        SpringApplication.run(Spring5JokesAppV2Application.class, args);
    }

    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }

}
