package com.example.xxx.service;

import com.example.xxx.entity.User;
import com.example.xxx.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>Title: com.example.xxx.service</p>
 * <p>Description: </p>
 *
 * @author 唐振耀
 * @date 2019/10/9
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public boolean selectUserByNameAndPassword(String u_name, String password) {
        System.out.println("输入账号密码"+u_name+","+password);
        User user = userMapper.selectUserByNameAndPassword(u_name, password);
        System.out.println("UserMapper的结果"+user);
        if (user == null) {
            return false;
        }else
        return true;

    }
}
