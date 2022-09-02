package com.yubin.service;

import com.yubin.common.Result;
import com.yubin.dao.OrderDao;
import com.yubin.entity.Order;
import com.yubin.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService implements OrderDao {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Override
    public Object insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public Object deleteOrder(String orderId) {
        int i =  orderMapper.deleteOrder(orderId);
        if (i == 0){
            return  new Result().error("删除失败，请重试！");
        }else{
            return new Result().success("删除成功！");
        }
    }

    @Override
    public Object updateOrder(Order order) {
        order.setUpdateTime(new Date());
        int i =  orderMapper.updateOrder(order);
        if (i ==0){
            return  new Result().error("更新失败，请重试！");
        }else {
            return new Result().success("更新成功!");
        }
    }

    @Override
    public Object selectAllOrder() {
        List<Order> orderList = orderMapper.selectAllOrder();
        if (orderList.size()>0){
            return new Result().success(orderList);
        }else{
            return new Result().error("查询失败，请重试");
        }
    }

    @Override
    public Object selectOrderById(String orderId) {
        Order order =  orderMapper.selectOrderById(orderId);
        if (order == null){
            return new Result().error("查找失败,该订单不存在");
        }else{
            return new Result().success(order);
        }
    }

    @Override
    public Object getOrderByPhone(String phone) {
        List<Order> orderList = orderMapper.getOrderByPhone(phone);
        if (orderList.size() > 0){
            return new Result().success(orderList);
        }else{
            return new Result().error("查找失败,该订单不存在");
        }
    }
}
