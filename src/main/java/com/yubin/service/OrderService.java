package com.yubin.service;

import com.yubin.dao.OrderDao;
import com.yubin.entity.Order;

import java.util.List;

public class OrderService implements OrderDao {

    @Override
    public int insertOrder(Order order) {
        return 0;
    }

    @Override
    public int deleteOrder(String id) {
        return 0;
    }

    @Override
    public int updateOrder(Order order) {
        return 0;
    }

    @Override
    public List<Order> selectAllOrder() {
        return null;
    }

    @Override
    public Order selectOrderById(String id) {
        return null;
    }
}
