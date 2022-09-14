package com.yubin.controller;

import com.yubin.entity.Order;
import com.yubin.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @ResponseBody
    @PostMapping("/insert")
    public Object insertOrder(Order order){
        return orderService.insertOrder(order);
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteOrder(String orderId){
        return orderService.deleteOrder(orderId);
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateOrderr(Order order){
        return orderService.updateOrder(order);
    }
    @PostMapping("/list")
    @ResponseBody
    public Object getOrderList( String role , String phone){
        return orderService.selectAllOrder(role,phone);
    }

    @PostMapping("/getOrderByPhone")
    @ResponseBody
    public Object getOrderByPhone(String phone){
        return orderService.getOrderByPhone(phone);
    }
    @PostMapping("/yuding")
    @ResponseBody
   public Object yuding(String userId ,String carId) {
        return orderService.yuding(userId, carId);
    }

    @PostMapping("/unyuding")
    @ResponseBody
    public Object unyuding(String carId,String orderId) {
        return orderService.unyuding(carId,orderId);
    }
}
