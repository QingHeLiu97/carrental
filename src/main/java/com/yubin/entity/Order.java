package com.yubin.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Order {

    //订单id
    private int orderId;
    //汽车id
    private int carId;
    //租车价格
    private String carPrice;
    //汽车类型
    private String carType;
    //汽车颜色
    private String carColor;
    //租车押金
    private String deposit;
    //租车人id
    private String userId;
    //租车人姓名
    private String username;
    //用户电话
    private String userPhone;
    //用户地址
    private String userAddress;
    //经办人
    private String handlersName;
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
