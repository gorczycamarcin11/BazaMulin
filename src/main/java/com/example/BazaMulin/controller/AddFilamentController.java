package com.example.BazaMulin.controller;

import com.example.BazaMulin.model.Filament;
import com.example.BazaMulin.service.FilamentService;
import com.example.BazaMulin.service.FilamentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

/**
 * Created by marcin on 30.07.17.
 */
@Controller
@RequestMapping("/add")
public class AddFilamentController {

    @Autowired
    FilamentService filamentServiceImpl;

    @GetMapping
    public ModelAndView add() {
        ModelAndView mav = new ModelAndView("form");
        Filament filament = new Filament();
        mav.addObject(filament);
        return mav;
    }

    @PostMapping
    public ModelAndView processForm(@ModelAttribute @Valid Filament filament, BindingResult bindingResult) {


        ModelAndView mav = new ModelAndView("form");
        mav.addObject(filament);
        if (bindingResult.hasErrors()) {
            return mav;
        } else {
            filamentServiceImpl.save(filament);
            return new ModelAndView("redirect:/list");
        }
    }
}

