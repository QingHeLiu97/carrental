package com.yubin.service;

import com.yubin.dao.UserDao;
import com.yubin.entity.User;
import com.yubin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDao {

    @Autowired
    private UserMapper orderMapper;
    public int insertUser(User user) {
        return orderMapper.insertUser(user);
    }

    @Override
    public int deleteUser(String id) {
        return orderMapper.deleteUser(id);
    }

    @Override
    public int updateUser(User user) {
        return orderMapper.updateUser(user);
    }

    @Override
    public List<User> selectAllUser() {
        return orderMapper.selectAllUser();
    }

    @Override
    public User selectUserByid(String id) {
        return orderMapper.selectUserByid(id);
    }

}
