package com.qf.dao;

import com.qf.pojo.User;
import org.apache.ibatis.annotations.Param;


/**
 * 2019/10/2520:25
 * <p>
 * 未知的事情 永远充满变数
 */
public interface UserDAO {


    User queryUsernamePassword(@Param("name1") String name1, @Param("password") String password);


    User queryUsername(@Param("name1")String username);
}
