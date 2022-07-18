package com.yubin.dao;

import com.yubin.entity.Car;

import java.util.List;

public interface CarDao {

    String insertCar(Car car);

    String deleteCarById(String id);

    String updateCar(Car car);

    List<Car> selectAllCar();

    Car selectCarByid(String id);
}
