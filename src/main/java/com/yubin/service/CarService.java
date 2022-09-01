package com.yubin.service;

import com.alibaba.fastjson.JSON;
import com.yubin.common.Result;
import com.yubin.dao.CarDao;
import com.yubin.entity.Car;
import com.yubin.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class CarService implements CarDao {

    @Autowired(required = false)
    private CarMapper carMapper;

    @Override
    public Object insertCar(Car car) {
        Result result = new Result();
        int i = carMapper.insertCar(car);
        if (i == 0){
            return result.error();
        }else{
            return result.success();
        }

    }

    @Override
    public Object deleteCarById(String carId) {
        Result result = new Result();
        int i  = carMapper.deleteCarById(carId);
        if (i == 0){
            return result.error();
        }else{
            return result.success();
        }
    }

    @Override
    public Object updateCar(Car car) {
        Result result = new Result();
        car.setUpdateTime(new Date());
        int i = carMapper.updateCar(car);
        if (i == 0){
            return result.error("删除失败");
        }else{
            return result.success();
        }

    }

    @Override
    public Object selectAllCar(String roles,String phone) {
        Result result = new Result();
        List<Car> carList = new ArrayList<>();
        if (phone ==null){
            carList = carMapper.selectAllCar();
        }else{
            carList = carMapper.selectCarByPhone(phone);
        }

        if (carList.size() > 0 ){
            return result.success(carList);
        }else{
            return result.error();
        }

    }

    @Override
    public Object selectCarByid(String id) {
        Result result =new Result();
        Car car = carMapper.selectCarByid(id);
        if (car == null){
            return result.error("找不到该车源");
        }else{
            return result.success(car);
        }

    }
}
