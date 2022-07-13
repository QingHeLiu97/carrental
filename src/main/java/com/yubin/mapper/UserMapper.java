package com.yubin.mapper;

import com.yubin.entity.User;

import java.util.List;

public interface UserMapper {

    int insertUser(User user);

    int deleteUser(String id);

    int updateUser(User user);

    List<User> selectAllUser();

    User selectUserByid(String id);
}
