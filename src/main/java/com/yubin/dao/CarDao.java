package com.yubin.dao;

import com.yubin.entity.Car;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CarDao {

    Object insertCar(String role,String phone,Car car);

    Object deleteCarById(String id);

    Object updateCar(Car car);

    Object selectAllCar(String role,String phone);

    Object selectCarByid(String id);
}
