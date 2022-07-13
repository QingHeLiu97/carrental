package com.yubin.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order {

    //订单id
    private int id;
    //汽车id
    private int car_id;
    //租车价格
    private String car_price;
    //汽车类型
    private String car_type;
    //汽车颜色
    private String car_color;
    //租车押金
    private String deposit;
    //用户id
    private int user_id;
    //用户电话
    private String user_phone;
    //用户地址
    private String user_adddress;
    //
    private String handlers_name;
    //状态
    private int status;
}
