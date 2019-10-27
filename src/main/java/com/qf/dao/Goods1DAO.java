package com.qf.dao;

import com.qf.pojo.Goods1;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;

/**
 * 2019/10/2615:50
 * <p>
 * 未知的事情 永远充满变数
 */
public interface Goods1DAO {
    void insertGoods(@Param("title") String title,@Param("imapath") String imapath,@Param("price") BigDecimal price);

    List<Goods1> selectall();


    void updateGoods(@Param("title") String title,@Param("imapath") String imapath,@Param("price") BigDecimal price,@Param("id")Integer id);

    Goods1 selecById(Integer id);
}
