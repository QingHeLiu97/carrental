package com.yubin.service;

import com.yubin.common.Result;
import com.yubin.dao.UserDao;
import com.yubin.entity.User;
import com.yubin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService implements UserDao {

    @Autowired(required = false)
    private UserMapper userMapper;
    public Object insertUser(User user) {
        Result result = new Result();
        user.setPassword(user.getUsername()+user.getPhone().substring(7,11));
        user.setCreateTime(new Date());
        if (userMapper.checkUser(user)==null) {
            int i = userMapper.insertUser(user);
            if (i == 0) {
                return result.error("创建用户失败！");
            } else {
                return result.success();
            }
        }else{
            return result.error("该用户已存在");
        }
    }

    @Override
    public Object deleteUser(String userId) {
        Result result = new Result();
        int deleteUser = userMapper.deleteUser(userId);
        if (deleteUser ==0){
            return result.error();
        }else{
            return result.success();
        }
    }

    @Override
    public Object updateUser(User user) {
        Result result = new Result();
        user.setUpdateTime(new Date());
        int updateUser = userMapper.updateUser(user);
        if (updateUser==0){
            return result.error();
        }else{
            return result.success();
        }
    }

    @Override
    public Object updatePassword(String userId) {
        Result result = new Result();
        User user = userMapper.selectUserByid(userId);
        user.setUpdateTime(new Date());
        user.setPassword("123456");
        int updateUser = userMapper.updateUser(user);
        if (updateUser==0){
            return result.error();
        }else{
            return result.success();
        }
    }


    @Override
    public Object selectAllUser(User user,int current ,int pageSize) {
        List<User> userList = userMapper.selectAll();
        Result result = new Result();
        return result.success(userList);
    }

    @Override
    public Object selectUserByid(String id) {
        Result result = new Result();
        User user = userMapper.selectUserByid(id);
        return result.success(user);
    }


}
