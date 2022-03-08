package com.strawberry.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.strawberry.pojo.User;
import com.strawberry.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

//@Controller
@RestController //该类下的所有方法不走视图解析器，直接返回字符串
public class UserController {

    @RequestMapping("/json1")
//    @ResponseBody //不走视图解析器，直接返回字符串
    public String json1() throws JsonProcessingException {
        User user = new User(1, "草莓汁", 20);
        return JsonUtils.getJson(user);
    }

    @RequestMapping("/json2")
    public String json2() {
        Date date = new Date();
        return JsonUtils.getJson(date);
    }

}
