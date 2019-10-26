package com.qf.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 2019/10/2520:28
 * <p>
 * 未知的事情 永远充满变数
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer id;
    private String name1 ;
    private String password;
    private String salt;

}
