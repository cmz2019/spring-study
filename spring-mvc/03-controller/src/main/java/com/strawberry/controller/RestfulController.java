package com.strawberry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestfulController {

    @PostMapping("/add/{a}/{b}")
    public String add1(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果1为"+res);
        return "test";
    }
    
    @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
    public String add2(@PathVariable int a, @PathVariable int b, Model model) {
        int res = a + b;
        model.addAttribute("msg", "结果2为"+res);
        return "test";
    }

}
