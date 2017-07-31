package com.example.BazaMulin.controller;

import com.example.BazaMulin.service.FilamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by marcin on 30.07.17.
 */
@Controller
@RequestMapping("/list")
public class ListFilamentController {

    @Autowired
    FilamentService filamentServiceImpl;

    @GetMapping
    public ModelAndView listFilament(){
        ModelAndView mav = new ModelAndView("list");
        mav.addObject("list",filamentServiceImpl.findAll());
        return mav;
    }
}
