package com.example.BazaMulin.controller;

import com.example.BazaMulin.service.FilamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by marcin on 31.07.17.
 */
@Controller
@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
public class DeleteFilamentController {

    @Autowired
    FilamentService filamentServiceImpl;

    @GetMapping("/{id}")
    public ModelAndView deleteFilament(@PathVariable("id") Long id){
        filamentServiceImpl.delete(id);
        return new ModelAndView("redirect:/list");
    }
}
