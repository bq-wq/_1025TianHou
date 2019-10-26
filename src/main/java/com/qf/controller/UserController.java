package com.qf.controller;

import com.qf.pojo.User;
import com.qf.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2019/10/269:35
 * <p>
 * 未知的事情 永远充满变数
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public  String  loginpage(){
        System.out.println("go to login");
        return "login";
    }

    @PostMapping("/login")
    public String login(User user){
        System.out.println(user);
        //获取subject调用login
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(user.getName1(),user.getPassword() );
        System.out.println(token);
        subject.login(token);

        System.out.println("登入验证！");

        return "index";
    }


}
