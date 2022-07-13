package com.yubin.service;

import com.yubin.dao.CarDao;
import com.yubin.entity.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService implements CarDao {

    @Override
    public int insertCar(Car car) {
        return 0;
    }

    @Override
    public int deleteCarById(String id) {
        return 0;
    }

    @Override
    public int updateCar(Car car) {
        return 0;
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
