package com.example.BazaMulin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by marcin on 30.07.17.
 */

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping
    public String index(){
        return "index";
    }

}
