package org.ucenter.web.servcie;

import org.ucenter.web.model.User;

public interface UserService {
    User findByKeyword(String keyword);
}
