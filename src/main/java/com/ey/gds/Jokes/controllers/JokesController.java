package com.ey.gds.Jokes.controllers;

import com.ey.gds.Jokes.services.ChuckNorrisQuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {
    private final ChuckNorrisQuotesService chuckNorrisQuotesService;

    @Autowired
    public JokesController(ChuckNorrisQuotesService chuckNorrisQuotesService) {
        this.chuckNorrisQuotesService = chuckNorrisQuotesService;
    }


    @RequestMapping("/")
    public String getQuote(Model model){
        String randomQuote = chuckNorrisQuotesService.getQuote();
        model.addAttribute("joke", randomQuote);
        return "chucknorris";
    }

}
