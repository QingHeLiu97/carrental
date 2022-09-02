package com.yubin.mapper;

import com.yubin.entity.Order;

import java.util.List;

public interface OrderMapper {

    int insertOrder(Order order);

    int deleteOrder(String id);

    int updateOrder(Order order);

    List<Order> selectAllOrder();
    List<Order> getOrderByPhone(String phone);

    List<Order> selectOrderRecord();

    Order selectOrderById(String id);
}
