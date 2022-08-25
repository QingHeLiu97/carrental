package com.yubin.mapper;

import com.yubin.entity.Appraise;

import java.util.List;

public interface AppraiseMapper {
    int insertAppraise(Appraise appraise);

    int deleteAppraiseById(String id);

    int updateAppraise(Appraise appraise);

    List<Appraise> selectAllAppraise();

    List<Appraise> selectAppraiseRecord();

    Appraise selectAppraiseById(String id);
}
