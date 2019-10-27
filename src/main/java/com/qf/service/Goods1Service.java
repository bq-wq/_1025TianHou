package com.qf.service;

import com.qf.pojo.Goods1;

import java.util.List;

/**
 * 2019/10/2615:47
 * <p>
 * 未知的事情 永远充满变数
 */
public interface Goods1Service {




    void insertGoods(Goods1 goods1);

    List<Goods1> selectAll();

    void updateGoods(Goods1 goods1);


    Goods1 selectById(int id);
}
