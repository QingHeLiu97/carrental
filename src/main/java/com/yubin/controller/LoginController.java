package com.yubin.controller;

import com.alibaba.fastjson.JSONObject;
import com.yubin.entity.Role;
import com.yubin.service.RoleService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.util.HashMap;

@Controller
@RequestMapping("/index")
public class LoginController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @GetMapping("/login")
    public String login(@PathParam("username") String username, @PathParam("password") String password){
       return roleService.ChcekRole(username, password);
    }
}
