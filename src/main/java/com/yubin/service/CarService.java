package com.yubin.service;

import com.alibaba.fastjson.JSON;
import com.yubin.common.Result;
import com.yubin.dao.CarDao;
import com.yubin.entity.Car;
import com.yubin.mapper.CarMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class CarService implements CarDao {

    @Autowired(required = false)
    private CarMapper carMapper;

    @Override
    public Object insertCar( String role,String phone , Car car) {
        Result result = new Result();
        int i = 0;
        if (role.equals("admin")){
            carMapper.insertCar(car);
        }else{
            car.setUserPhone(phone);
            car.setCreateTime(new Date());
            carMapper.insertCar(car);
        }
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
