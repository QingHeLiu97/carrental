package com.yubin.controller;

import com.yubin.entity.Car;
import com.yubin.entity.Notice;
import com.yubin.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/notice")
public class NoticeController {

    @Autowired
    private NoticeService noticeService;

    @ResponseBody
    @PostMapping("/insert")
    public Object insertCar(Notice notice){
        return noticeService.insertNotice(notice);
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteCar(String id){
        return noticeService.deleteNotice(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateCar(Notice notice){
        return noticeService.updateNotice(notice);
    }
    @PostMapping("/list")
    @ResponseBody
    public Object getCarList(){
        return noticeService.selectAllNotice();
    }

    @PostMapping("/page")
    @ResponseBody
    public Object getCarListPage(){
        return noticeService.selectAllNotice();
    }
}
