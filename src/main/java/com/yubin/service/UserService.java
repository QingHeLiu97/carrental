package com.yubin.service;

import com.yubin.dao.UserDao;
import com.yubin.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDao {

    @Override
    public int insertUser(User user) {
        return 0;
    }

    @Override
    public int deleteUser(String id) {
        return 0;
    }

    @Override
    public int updateUser(User user) {
        return 0;
    }

    @Override
    public List<User> selectAllUser() {
        return null;
    }

    @Override
    public User selectUserByid(String id) {
        return null;
    }

}
