package com.zhongda.IoT.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping
    public String sayHello() {
        //钱波：
        //读一个html文件返回
        return "欢迎来到IoT 网站 to /api/protocol <br>"
        +"this is IoT document <br>"
        + "/api/createtable";
    }
}
