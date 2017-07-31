package com.example.BazaMulin.controller;

import com.example.BazaMulin.model.Filament;
import com.example.BazaMulin.service.FilamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by marcin on 31.07.17.
 */
@Controller
@RequestMapping(value = "/modify", method = RequestMethod.PUT)
public class ModifyFilamentController {

    @Autowired
    private FilamentService filamentServiceImpl;


    @GetMapping("/{id}")
    public ModelAndView modifyFilament(@PathVariable("id") Long id){
        Filament filament = filamentServiceImpl.get(id);
        filamentServiceImpl.delete(id);
        ModelAndView mav = new ModelAndView("modify");
        mav.addObject(filament);
        return mav;
    }
}
