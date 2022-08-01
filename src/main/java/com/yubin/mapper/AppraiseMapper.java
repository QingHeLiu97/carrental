package com.yubin.mapper;

import com.yubin.entity.Appraise;

import java.util.List;

public interface AppraiseMapper {
    String insertAppraise(Appraise appraise);

    String deleteAppraiseById(String id);

    String updateAppraise(Appraise appraise);

    List<Appraise> selectAllAppraise();

    List<Appraise> selectAppraiseRecord();

    Appraise selectAppraiseById(String id);
}
