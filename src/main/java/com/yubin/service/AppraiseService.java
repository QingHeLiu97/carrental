package com.yubin.service;

import com.yubin.common.Result;
import com.yubin.dao.AppraiseDao;
import com.yubin.entity.Appraise;
import com.yubin.entity.Order;
import com.yubin.mapper.AppraiseMapper;
import com.yubin.mapper.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class AppraiseService implements AppraiseDao {

    @Autowired(required = false)
    private AppraiseMapper appraiseMapper;

    @Autowired(required = false)
    private OrderMapper orderMapper;

    @Override
    public Object insertAppraise(Appraise appraise) {

        appraise.setCreateTime(new Date());
        appraise.setStatus("0");
        int i = appraiseMapper.insertAppraise(appraise);
        if (i == 0){
            return new Result().error();
        }else{
            if (appraise.getOrderId()!=null){
                Order order = orderMapper.selectOrderById(appraise.getOrderId());
                order.setUpdateTime(new Date());
                order.setStatus("3");
                orderMapper.updateOrder(order);
            }
            return new Result().success();
        }
    }

    @Override
    public Object deleteAppraise(String apprId) {
        Result result = new Result();
        int i  = appraiseMapper.deleteAppraiseById(apprId);
        if (i == 0){
            return result.error();
        }else{
            return result.success();
        }

    }

    @Override
    public Object updateAppraise(Appraise appraise) {
        Result result = new Result();
        appraise.setUpdateTime(new Date());
        int i =  appraiseMapper.updateAppraise(appraise);
        if (i ==0){
            return result.error();
        }else{
            return result.success();
        }
    }

    @Override
    public Object selectAllAppraise(String role ,String phone) {
        Result result = new Result();
        List<Appraise> appraiseList = new ArrayList<>();
        if (role.equals("admin")){
            appraiseList =  appraiseMapper.selectAllAppraise();
        }else{
            if (phone ==null){
                appraiseList = appraiseMapper.selectAllAppraiseByUser();
            }else{
                appraiseList = appraiseMapper.selectAppraiseByPhone(phone);
            }

        }


        if (appraiseList.size()>0){
            return result.success(appraiseList);
        }else{
            return result.error();
        }
    }

    @Override
    public Object selectAppraiseById(String apprId) {
        Result result = new Result();
        Appraise appraise = appraiseMapper.selectAppraiseById(apprId);
        if (appraise!=null){
            return result.success(appraise);
        }else{
            return result.error();
        }

    }
}
