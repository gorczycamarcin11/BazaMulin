package com.example.BazaMulin.controller;

import com.example.BazaMulin.model.Filament;
import com.example.BazaMulin.service.FilamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by marcin on 30.07.17.
 */
@Controller
@RequestMapping("/search")
public class SearchFilamentController {

    @Autowired
    FilamentService filamentServiceImpl;


    @GetMapping
    public ModelAndView searchFilament() {
        ModelAndView mav = new ModelAndView("search");
        Filament filament = new Filament();
        mav.addObject(filament);
        return mav;
    }

    @PostMapping
    public ModelAndView searchFilamentForm(String codename) {

        ModelAndView mav =new ModelAndView("result");
        mav.addObject("list", filamentServiceImpl.findByCodename(codename));

        return mav;

    }

}

