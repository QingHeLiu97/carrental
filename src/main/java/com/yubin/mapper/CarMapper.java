package com.yubin.mapper;

import com.yubin.entity.Car;

import java.util.List;

public interface CarMapper {

    int insertCar(Car car);

    int deleteCarById(String carId);

    int updateCar(Car car);

    List<Car> selectAllCar();

    List<Car> selectCarRecord();

    Car selectCarByid(String id);

    List<Car> selectCarByPhone(String phone);
}
