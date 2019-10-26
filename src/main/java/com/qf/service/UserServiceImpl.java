package com.qf.service;

import com.qf.dao.UserDAO;
import com.qf.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2019/10/269:27
 * <p>
 * 未知的事情 永远充满变数
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;
    @Override
    public User queryUsernamePassword(String name1, String password) {
        return userDAO.queryUsernamePassword(name1, password);

    }

    @Override
    public User queryUsername(String username) {
        return userDAO.queryUsername(username );
    }



    public Integer insertUser(){
        //后台注册


        return null;
    }


}
