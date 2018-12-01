package com.am.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/homepage")
    public ModelAndView homepage() throws Exception {
        //返回ModelAndView
        ModelAndView modelAndView =  new ModelAndView();
        //指定视图
        modelAndView.setViewName("homepage");
        return modelAndView;
    }
    @RequestMapping("/hello")
    public String test() throws Exception {
        String message = "Welcome to Spring 4.0 !";
        return message;
    }
}
