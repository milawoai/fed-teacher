package com.zhoushijie.mock.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldJSONController {
    @RequestMapping(value = "/hellonihao")
    public
    @ResponseBody
    String helloNiHao() {
        return "helloNiHao";
    }
}
