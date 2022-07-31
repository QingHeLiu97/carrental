package com.yubin.controller;

import com.yubin.entity.User;
import com.yubin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/insert")
    @ResponseBody
    public Object insertUser(User user){
        return userService.insertUser(user) ;
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteUser(String id){
        return userService.deleteUser(id) ;
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateUser(User user){
        return userService.updateUser(user) ;
    }

    @PostMapping("/list")
    @ResponseBody
    public Object User(){
        return userService.selectAllUser() ;
    }
}
