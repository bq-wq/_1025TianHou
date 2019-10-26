package com.qf.dao;

import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * 2019/10/2615:50
 * <p>
 * 未知的事情 永远充满变数
 */
public interface Goods1DAO {
    void insertGoods(@Param("title") String title,@Param("imapath") String imapath,@Param("price") BigDecimal price);
}
