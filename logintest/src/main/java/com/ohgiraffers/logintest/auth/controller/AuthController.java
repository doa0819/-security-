package com.ohgiraffers.logintest.auth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AuthController {

    @GetMapping("/login")
    public void login() {}

    @GetMapping("/fail")
    public ModelAndView loginFail(ModelAndView mv,@RequestParam String message) {
        mv.addObject("message", message);
        mv.setViewName("/fail");

        return mv;
    }
}
