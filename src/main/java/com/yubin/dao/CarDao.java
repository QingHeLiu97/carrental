package com.yubin.dao;

import com.yubin.entity.Car;

import java.util.List;

public interface CarDao {

    Object insertCar(Car car);

    Object deleteCarById(String id);

    Object updateCar(Car car);

    Object selectAllCar(String role,String phone);

    Object selectCarByid(String id);
}
