package com.demo.MyFleetApp;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {

@GetMapping("/index")
    public String home(){
        return "index";
    }

@GetMapping("/login")
public String login(){
        return "login";
    }

@GetMapping("/logout")
public String logout(){ return "logout";
}

}
