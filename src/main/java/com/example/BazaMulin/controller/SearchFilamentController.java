package com.example.BazaMulin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by marcin on 30.07.17.
 */
@Controller
@RequestMapping("/search")
public class SearchFilamentController {

    @GetMapping
    public String searchFilament(){
        return "search";
    }
}
