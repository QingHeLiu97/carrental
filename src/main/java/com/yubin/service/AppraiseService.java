package com.yubin.service;

import com.yubin.dao.AppraiseDao;
import com.yubin.entity.Appraise;
import com.yubin.mapper.AppraiseMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppraiseService implements AppraiseDao {

    @Autowired(required = false)
    private AppraiseMapper appraiseMapper;


    @Override
    public String insertAppraise(Appraise appraise) {
        return appraiseMapper.insertAppraise(appraise);
    }

    @Override
    public String deleteAppraise(String appr_id) {
        return appraiseMapper.deleteAppraiseById(appr_id);
    }

    @Override
    public String updateAppraise(Appraise appraise) {
        return appraiseMapper.updateAppraise(appraise);
    }

    @Override
    public List<Appraise> selectAllAppraise() {
        return appraiseMapper.selectAllAppraise();
    }

    @Override
    public Appraise selectAppraiseById(String appr_id) {
        return appraiseMapper.selectAppraiseById(appr_id);
    }
}
