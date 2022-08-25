package com.yubin.dao;

import com.yubin.entity.User;

import java.util.List;

public interface UserDao {

    Object insertUser(User user);

    Object deleteUser(String id);

    Object updateUser(User user);

    Object updatePassword(String  userId);

    Object selectAllUser(User user,int current ,int limit);

    Object selectUserByid(String id);
}
