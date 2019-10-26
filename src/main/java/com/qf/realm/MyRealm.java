package com.qf.realm;

import com.qf.pojo.User;
import com.qf.service.UserService;
import lombok.Setter;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

/**
 * 2019/10/2611:16
 * <p>
 * 未知的事情 永远充满变数
 */
@Setter
public class MyRealm  extends AuthorizingRealm {
    //最好在配置文件注入

    private UserService userService;


    @Override //查询权限
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override   //查询用户信息
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken Token) throws AuthenticationException {
            //获取用户登录的用户名
        String username = (String) Token.getPrincipal();
        System.out.println("-----"+username);

        User user = userService.queryUsername(username );
        if(user == null){
            return null;
        }
        System.out.println("查找到的登录用户！" +user);


        return new SimpleAuthenticationInfo(user.getName1(),
                user.getPassword(),
                ByteSource.Util.bytes(user.getSalt()),
                this.getName()
                );
    }
}
