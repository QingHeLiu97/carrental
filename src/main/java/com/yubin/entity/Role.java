package com.yubin.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Role {

    //编号
    private int id;
    //用户id
    private String user_id;
    //用户名
    private String user_name;
    //角色
    private String role;
    //创建时间
    private Date create_time;
    //更新时间
    private Date update_time;
    //状态
    private int status;

}
