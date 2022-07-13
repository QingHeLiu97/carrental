package com.yubin.dao;

import com.yubin.entity.Order;

import java.util.List;

public interface OrderDao {

    int insertOrder(Order order);

    int deleteOrder(String id);

    int updateOrder(Order order);

    List<Order> selectAllOrder();

    Order selectOrderById(String id);
}
