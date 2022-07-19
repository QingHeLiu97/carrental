package com.yubin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @ResponseBody
    @PostMapping("/login")
    public String login(HttpServletRequest request){
        System.out.println("进入了登录页面");
        System.out.println(request);
        return null;
    }
}
