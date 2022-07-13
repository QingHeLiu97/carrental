package com.yubin.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Car {

    //汽车编号
    private int id;
    //类型
    private String type;
    //颜色
    private String color;
    //价格
    private String price;
    //押金
    private String deposit;
    //车名
    private String carname;
    //租车人id
    private String user_id;
    //租车人姓名
    private String username;
    //创建时间
    private Date create_time;
    //更新时间
    private Date  update_time;
    //状态
    private int status;
}
