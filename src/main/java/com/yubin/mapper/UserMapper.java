package com.yubin.mapper;

import com.yubin.entity.User;

import java.util.List;

public interface UserMapper {

    int insertUser(User user);

    int deleteUser(String userId);

    int updateUser(User user);
    User checkUser (User user);

    List<User> selectAll();
    List<User> getListSize();
    List<User> selectAllUser(int leftPage, int rightPage);

    List<User> selectUserRecord();

    User selectUserByid(String userId);
    User getUserInfo(User user);
}
