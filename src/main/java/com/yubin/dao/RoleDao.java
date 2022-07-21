package com.yubin.dao;
import com.yubin.entity.Role;

import java.util.List;

public interface RoleDao {

    int insertRole(Role role);

    int deleteRoleById(String id);

    int updateRole(Role role);

    List<Role> selectAllRole();

    Role selectRoleByid(String id);

    String ChcekRole(String username,String password);
}
