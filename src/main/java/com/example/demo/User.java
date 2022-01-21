package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/*//@Controller
*/
@RestController
public class User {
	/* @ResponseBody */
    @RequestMapping("/")
    public String index() {
    	return "index";
    }

}
