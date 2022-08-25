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
    public Object insertRole(Role role) {
        int i = roleMapper.insertRole(role);
        if (i==0){
            return new Result().error("添加失败，请重试！");
        }else{
            return new Result().success("添加成功！");
        }
    }

    @Override
    public Object deleteRoleById(String id) {
        int i = roleMapper.deleteRoleById(id);
        if (i == 0){
            return new Result().error("删除失败，请重试!");
        }else{
            return new Result().success("删除成功，请重试！");
        }
    }

    @Override
    public Object updateRole(Role role) {
        int i = roleMapper.updateRole(role);
        if (i== 0){
            return new Result().error("更新失败，请重试！");
        }else{
            return new Result().success("更新成功!");
        }
    }

    @Override
    public Object selectAllRole() {
        return null;
    }

    @Override
    public Object selectRoleByid(String id) {
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
        token= JWT.create().withAudience(String.valueOf(user.getUserId())).sign(Algorithm.HMAC256(user.getPassword()));
        return token;
    }
}
