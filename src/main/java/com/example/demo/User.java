package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class User {
    @ResponseBody
    @RequestMapping("/")
    public String init() {
   	 return "Index Page";
    }

}
