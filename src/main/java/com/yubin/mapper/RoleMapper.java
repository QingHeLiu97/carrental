package com.yubin.mapper;

import com.yubin.entity.Role;

import java.util.List;

public interface RoleMapper {
    int insertRole(Role role);

    int deleteRoleById(String id);

    int updateRole(Role role);

    List<Role> selectAllRole();

    List<Role> selectRoleRecord(String phone);

    Role selectRoleByid(String id);

    Role ChcekRole(String username);

}
