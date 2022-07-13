package com.yubin.dao;

import com.yubin.entity.Car;

import java.util.List;

public interface CarDao {

    int insertCar(Car car);

    int deleteCarById(String id);

    int updateCar(Car car);

    List<Car> selectAllCar();

    Car selectCarByid(String id);
}
