package com.shatazone.jokesapp;

import com.shatazone.jokesapp.services.JokeService;
import org.springframework.stereotype.Controller;

@Controller
public class JokeController {
    private final JokeService jokeService;

    public JokeController(JokeService jokeService) {
        this.jokeService = jokeService;
    }
    
    public String getJoke() {
        return jokeService.getJoke();
    }
}
