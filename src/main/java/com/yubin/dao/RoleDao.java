package com.yubin.dao;
import com.yubin.entity.Role;
import com.yubin.entity.User;

import java.util.List;

public interface RoleDao {

    Object insertRole(Role role);

    Object deleteRoleById(String id);

    Object updateRole(Role role);

    Object selectAllRole();

    Object selectRoleByid(String id);

    Object ChcekRole(User user);
}
