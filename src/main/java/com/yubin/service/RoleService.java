package com.yubin.service;

import com.alibaba.fastjson.JSONObject;
import com.yubin.dao.RoleDao;
import com.yubin.entity.Role;
import com.yubin.entity.User;
import com.yubin.mapper.RoleMapper;
import com.yubin.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
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
    public String ChcekRole(String username,String password) {
        HashMap<Integer,String> map = new HashMap<>();
        Role role = roleMapper.ChcekRole(username);
        if (role!=null){
            User user = userMapper.selectUserByid(role.getUser_id());
            if (user !=null &&user.getPassword().equals(password)){
                if (role.getRole().equals("super")){
                    map.put(0,"登陆成功!");
                }else if (role.getRole().equals("admin")){
                    map.put(1,"登陆成功!");
                }else {
                    map.put(2,"登陆成功!");
                }
            }else{
                map.put(99,"密码错误");
            }
        }else{
            map.put(99,"用户账号或密码错误");
        }

        return JSONObject.toJSONString(map);
    }
}
