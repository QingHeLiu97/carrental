package com.yubin.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    //用户编号
    private int id;
    //用户名
    private String username;
    //用户密码
    private String password;
    //用户性别
    private int sex;
    //用户号码
    private String phone;
    //用户邮箱
    private String email;
    //用户身份证
    private String id_card;
    //用户地址
    private String address;
    //创建时间
    private String create_time;
    //更新时间
    private String update_time;
    //状态
    private int status;
}
