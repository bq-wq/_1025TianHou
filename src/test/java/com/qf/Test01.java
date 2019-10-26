package com.qf;

import com.qf.dao.UserDAO;
import com.qf.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 2019/10/2520:42
 * <p>
 * 未知的事情 永远充满变数
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test01 {

    @Test
    public void daoTest(){

        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDAO user =context.getBean("userDAO",UserDAO.class);
          User user1=user.queryUsernamePassword("root", "123456");
        System.out.println(user1);
    }


}
