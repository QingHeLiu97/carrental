package com.yubin.dao;

import com.yubin.entity.Appraise;

import java.util.List;

public interface AppraiseDao {

    Object insertAppraise(Appraise appraise);

    Object deleteAppraise(String appr_id);

    Object updateAppraise(Appraise appraise);

    Object selectAllAppraise();

    Object selectAppraiseById(String appr_id);
}
