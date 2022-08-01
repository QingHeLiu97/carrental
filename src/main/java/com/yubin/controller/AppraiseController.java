package com.yubin.controller;

import com.yubin.entity.Appraise;
import com.yubin.service.AppraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/appraise")
public class AppraiseController {

    @Autowired
    private AppraiseService appraiseService;

    @PostMapping("/insert")
    @ResponseBody
    public Object insertAppraise(Appraise appraise){
        return appraiseService.insertAppraise(appraise
        ) ;
    }

    @PostMapping("/delete")
    @ResponseBody
    public Object deleteAppraise(String id){
        return appraiseService.deleteAppraise(id);
    }

    @PostMapping("/update")
    @ResponseBody
    public Object updateAppraise(Appraise appraise){
        return appraiseService.updateAppraise(appraise);
    }

    @PostMapping("/list")
    @ResponseBody
    public Object getAppraise(){
        return appraiseService.selectAllAppraise() ;
    }
}
