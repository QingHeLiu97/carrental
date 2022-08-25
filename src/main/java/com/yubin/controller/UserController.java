package com.yubin.controller;

import com.yubin.entity.User;
import com.yubin.service.UserService;
import org.apache.ibatis.annotations.Param;
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
    public Object deleteUser(@Param("userId") String userId){
        return userService.deleteUser(userId) ;
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateUser(User user){
        return userService.updateUser(user) ;
    }

    @PostMapping("/list")
    @ResponseBody
    public Object User(Integer current,
                       Integer pageSize,
                       String role,
                       String name,
                       String phone,
                       String idCard,
                       String status){
        User user =new User();
        if (name !=null){
            user.setUsername(name);
        }
        if (phone!=null){
            user.setPhone(phone);
        }
        if (idCard!=null){
            user.setIdCard(idCard);
        }
        if (status!=null){
            user.setStatus(status);
        }
        return userService.selectAllUser(user,current, pageSize) ;
    }

    @PostMapping("/updatePassword")
    @ResponseBody
    public Object updatePassword(@Param("userId") String userId){
        return userService.updatePassword(userId) ;
    }
}
