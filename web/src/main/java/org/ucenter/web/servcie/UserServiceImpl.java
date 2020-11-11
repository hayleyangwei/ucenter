package org.ucenter.web.servcie;

import org.ucenter.web.dao.UserMapper;
import org.ucenter.web.model.User;

import javax.annotation.Resource;

public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;

    @Override
    public User findByKeyword(String keyword) {
        return this.userMapper.selectByKeyword(keyword);
    }
}
