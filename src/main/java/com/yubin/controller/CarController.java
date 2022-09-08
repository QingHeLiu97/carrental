package com.yubin.controller;

import com.yubin.entity.Car;
import com.yubin.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @ResponseBody
    @PostMapping("/insert")
    public Object insertCar(String role,String phone , Car car){
        return carService.insertCar(role, phone, car);
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteCar(String carId){
        return carService.deleteCarById(carId);
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateCar(Car car){
        return carService.updateCar(car);
    }

    @PostMapping("/list")
    @ResponseBody
    public Object getCarList(String role,String phone){
        return carService.selectAllCar(role,phone);
    }

    @PostMapping("/resever")
    @ResponseBody
    public Object reseverCar(String carId,String phone){
        return null;
    }

}
