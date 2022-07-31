package com.yubin.service;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.yubin.common.Result;
import com.yubin.dao.RoleDao;
import com.yubin.entity.Role;
import com.yubin.entity.User;
import com.yubin.mapper.RoleMapper;
import com.yubin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleService implements RoleDao {

    @Autowired(required = false)
    private UserMapper userMapper;
    @Autowired(required = false)
    private RoleMapper roleMapper;

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

    @Override
    public Object ChcekRole(User user) {
        Result result = new Result();
        User userInfo = userMapper.getUserInfo(user);
        if(userInfo == null){
            result.error("500","账号或密码不正确");
        }else{
            Role role = roleMapper.ChcekRole(user.getUsername());
            userInfo.setRole(role.getRole());
            if (userInfo.getToken() == null) {
                userInfo.setToken(getToken(userInfo));
            }

        }
        return result.success(userInfo);
    }

    public String getToken(User user) {
        String token="";
        token= JWT.create().withAudience(String.valueOf(user.getUser_id())).sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
