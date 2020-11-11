package org.ucenter.web.manager;

import org.ucenter.web.model.User;
import org.ucenter.web.servcie.UserService;

import javax.annotation.Resource;

public class LoginManager {
    @Resource
    private UserService userService;

    public User findByKeyword(String keyword) {
        return this.userService.findByKeyword(keyword);
    }
}
