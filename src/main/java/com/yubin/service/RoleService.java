package com.yubin.service;

import com.yubin.dao.RoleDao;
import com.yubin.entity.Role;

import java.util.List;

public class RoleService implements RoleDao {

    @Override
    public int insertRole(Role role) {
        return 0;
    }

    @Override
    public int deleteRoleById(String id) {
        return 0;
    }

    @Override
    public int updateRole(Role role) {
        return 0;
    }

    @Override
    public List<Role> selectAllRole() {
        return null;
    }

    @Override
    public Role selectRoleByid(String id) {
        return null;
    }
}
