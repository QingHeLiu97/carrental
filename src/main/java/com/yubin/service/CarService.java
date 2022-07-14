package com.yubin.service;

import com.alibaba.fastjson.JSON;
import com.yubin.dao.CarDao;
import com.yubin.entity.Car;
import com.yubin.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements CarDao {

    @Autowired
    private CarMapper carMapper;

    @Override
    public String insertCar(Car car) {
        return JSON.toJSONString(carMapper.insertCar(car));
    }

    @Override
    public String deleteCarById(String id) {
        return JSON.toJSONString(carMapper.deleteCarById(id));
    }

    @Override
    public String updateCar(Car car) {
        return null;
    }

    @Override
    public List<Car> selectAllCar() {
        return null;
    }

    @Override
    public Car selectCarByid(String id) {
        return null;
    }
}
