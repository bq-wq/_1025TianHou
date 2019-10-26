package com.qf.service;

import com.qf.pojo.User;

/**
 * 2019/10/269:20
 * <p>
 * 未知的事情 永远充满变数
 */
public interface UserService {

    User queryUsernamePassword(String name1, String password);


    User queryUsername(String username);
}
