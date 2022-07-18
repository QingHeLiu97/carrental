package com.yubin.mapper;

import com.yubin.entity.Role;

import java.util.List;

public interface AppraiseMapper {
    int insertAppraise(Role role);

    int deleteAppraiseById(String id);

    int updateAppraise(Role role);

    List<Role> selectAllAppraise();

    List<Role> selectAppraiseRecord();

    Role selectAppraiseByid(String id);
}
