package top.lemcoo.Mybatis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lemcoo.Mybatis.beans.User;
import top.lemcoo.Mybatis.service.UserService;
import top.lemcoo.Mybatis.mapper.UserMapper;

import java.util.List;

/**
 * 【】
 *
 * @Author: zwx
 * @Date: 2021/3/4 09:50
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getUserList() {
        return userMapper.getUserList();
    }
}
