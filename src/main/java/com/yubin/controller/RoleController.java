package com.yubin.controller;

import com.yubin.entity.Car;
import com.yubin.entity.Role;
import com.yubin.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @ResponseBody
    @PostMapping("/insert")
    public Object insertRole(Role role){
        return roleService.insertRole(role);
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteRole(String id){
        return roleService.deleteRoleById(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateRole(Role role){
        return roleService.updateRole(role);
    }

    @PostMapping("/list")
    @ResponseBody
    public Object getRoleList(){
        return roleService.selectAllRole();
    }

}
