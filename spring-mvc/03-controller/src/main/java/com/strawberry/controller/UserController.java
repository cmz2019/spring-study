package com.strawberry.controller;

import com.strawberry.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {

    @GetMapping("/t1")
    private String test1(@RequestParam("username") String name, Model model) {
        System.out.println("接收到的前端name:" + name);
        model.addAttribute("msg", name);
        return "test";
    }

    @GetMapping("/t2")
    private String test2(User user) {
        System.out.println(user);
        return "test";
    }

    @GetMapping("/t3")
    private String test3() {
        return "test";
    }

}
