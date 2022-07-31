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

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @ResponseBody
    @PostMapping("/insert")
    public Object insertCar(Car car){
        return carService.insertCar(car);
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteCar(String id){
        return carService.deleteCarById(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateCar(Car car){
        return carService.updateCar(car);
    }

    @PostMapping("/list")
    @ResponseBody
    public Object getCarList(){
        return carService.selectAllCar();
    }
}
