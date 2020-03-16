package com.zrj.Service;

import com.zrj.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
