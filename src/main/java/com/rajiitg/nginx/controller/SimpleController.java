package com.rajiitg.nginx.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController("SimpleController")
@RequestMapping(value = "/", produces="application/json")
public class SimpleController {

    @RequestMapping(method= RequestMethod.GET, value="/home")
    public String imHome(Model model){
        return "Welcome Home!!!";
    }

    @RequestMapping(method= RequestMethod.GET, value="")
    public String imHome1(Model model){
        return "Welcome Home 1!!!";
    }
}
