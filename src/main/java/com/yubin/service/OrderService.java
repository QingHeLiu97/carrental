package com.yubin.service;

import com.yubin.dao.OrderDao;
import com.yubin.entity.Order;
import com.yubin.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService implements OrderDao {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public int deleteOrder(String id) {
        return orderMapper.deleteOrder(id);
    }

    @Override
    public int updateOrder(Order order) {
        return orderMapper.updateOrder(order);
    }

    @Override
    public List<Order> selectAllOrder() {
        return orderMapper.selectAllOrder();
    }

    @Override
    public Order selectOrderById(String id) {
        return orderMapper.selectOrderById(id);
    }
}
