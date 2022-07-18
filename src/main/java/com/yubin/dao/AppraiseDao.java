package com.yubin.dao;

import com.yubin.entity.Appraise;

import java.util.List;

public interface AppraiseDao {

    String insertAppraise(Appraise appraise);

    String deleteAppraise(String appr_id);

    List<Appraise> selectAllAppraise();

    Appraise selectAppraiseById(String appr_id);
}
