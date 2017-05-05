package com.pochit.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by emilianoalbiani on 4/26/17.
 */
//@Controller
public class BasicController {
    String message = "Welcome to Spring MVC!";

    @RequestMapping("/hello")
    public ModelAndView showMessage(
            @RequestParam(value = "name", required = false, defaultValue = "World") String name) {
        System.out.println("in controller");

        ModelAndView mv = new ModelAndView("helloworld");
        mv.addObject("message", message);
        mv.addObject("name", name);
        return mv;
    }
}
