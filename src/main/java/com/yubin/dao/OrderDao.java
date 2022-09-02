package com.yubin.dao;

import com.yubin.entity.Order;

import java.util.List;

public interface OrderDao {

    Object insertOrder(Order order);

    Object deleteOrder(String id);

    Object updateOrder(Order order);

    Object selectAllOrder();

    Object getOrderByPhone(String phone);

    Object selectOrderById(String id);
}
