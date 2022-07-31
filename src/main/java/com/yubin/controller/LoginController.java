package com.yubin.controller;

import com.yubin.entity.User;
import com.yubin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.server.PathParam;
import java.util.HashMap;

@Controller
@RequestMapping("/common")
public class LoginController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @PostMapping("/login")
    public Object login(@RequestBody User user){
       return roleService.ChcekRole(user);
    }
}
