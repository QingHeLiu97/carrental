package com.yubin.service;

import com.yubin.common.Result;
import com.yubin.dao.OrderDao;
import com.yubin.entity.Car;
import com.yubin.entity.Order;
import com.yubin.entity.User;
import com.yubin.mapper.AppraiseMapper;
import com.yubin.mapper.CarMapper;
import com.yubin.mapper.OrderMapper;
import com.yubin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class OrderService implements OrderDao {

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Autowired(required = false)
    private UserMapper userMapper;

    @Autowired(required = false)
    private AppraiseMapper appraiseMapper;

    @Autowired(required = false)
    private CarMapper carMapper;
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
        if (order.getStatus().equals("3") || order.getStatus().equals("1")){
            Car car = carMapper.selectCarByid(String.valueOf(order.getCarId()));
            car.setStatus("0");
            carMapper.updateCar(car);
        }
        int i =  orderMapper.updateOrder(order);
        if (i ==0){
            return  new Result().error("更新失败，请重试！");
        }else {
            return new Result().success("更新成功!");
        }
    }

    @Override
    public Object selectAllOrder(String role ,String phone) {
        List<Order> orderList = new ArrayList<>();
        if (role.equals("admin")){
           orderList = orderMapper.selectAllOrder();
        }else {
            orderList = orderMapper.getOrderByPhoneNotNull(phone);
        }
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
    public Object yuding(String userId, String carId) {
        if (userId!=null && carId!=null){
            User user = userMapper.selectUserByid(userId);
            Car car = carMapper.selectCarByid(carId);
            Order order = new Order().builder()
                    .carColor(car.getColor())
                    .carType(car.getType())
                    .carId(car.getCarId())
                    .carPrice(car.getPrice())
                    .deposit(car.getDeposit())
                    .userId(userId)
                    .username(user.getUsername())
                    .userAddress(user.getAddress())
                    .userPhone(user.getPhone())
                    .createTime(new Date())
                    .status("0")
                    .build();
            int i = orderMapper.insertOrder(order);
            car.setStatus("2");
            carMapper.updateCar(car);
            if (i !=0){
                return new Result().success("更新成功!");
            }
        }
        return  new Result().error("更新失败，请重试！");
    }

    @Override
    public Object getOrderByPhone(String phone) {
        List<Order> orderList = orderMapper.getOrderByPhone(phone);
        if (orderList.size() > 0){
            for( int i=0;i<orderList.size();i++){
                if(appraiseMapper.selectAppraiseByOrderId(String.valueOf(orderList.get(i).getOrderId()))!=null){
                    orderList.remove(i);
                }
            }
            return new Result().success(orderList);
        }else{
            return new Result().error("查找失败,该订单不存在");
        }
    }

    @Override
    public Object unyuding(String carId,String orderId) {
        if (carId!=null && orderId!=null){
            Car car = carMapper.selectCarByid(carId);
            car.setStatus("0");
            int i = orderMapper.deleteOrder(orderId);
            carMapper.updateCar(car);
            if (i != 0){

                return new Result().success("取消成功!");
            }
        }
        return  new Result().error("取消失败，请重试！");
    }
}
