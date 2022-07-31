package com.yubin.dao;
import com.yubin.entity.Role;
import com.yubin.entity.User;

import java.util.List;

public interface RoleDao {

    int insertRole(Role role);

    int deleteRoleById(String id);

    int updateRole(Role role);

    List<Role> selectAllRole();

    Role selectRoleByid(String id);

    Object ChcekRole(User user);
}
