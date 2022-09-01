package com.yubin.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User  extends BaseEntity{

    //用户编号
    private int userId;

    private String token;
    private String role;
    //用户名
    private String username;
    //用户密码
    private String password;
    //用户性别
    private String sex;
    //用户号码
    private String phone;
    //用户邮箱
    private String email;
    //用户身份证
    private String idCard;
    //用户地址
    private String address;
    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    //更新时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    //状态
    private String status;

}
