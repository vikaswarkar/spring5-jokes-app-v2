package com.example.spring5jokesappv2.jokes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/jokes")
    public String generateRandomJoke(Model model){
        model.addAttribute("joke", jokeService.getJoke());
        System.out.println("----->>>" + jokeService.getJoke());
        return "index";
    }

}
