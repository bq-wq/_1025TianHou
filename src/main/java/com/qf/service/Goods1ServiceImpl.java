package com.qf.service;

import com.qf.dao.Goods1DAO;
import com.qf.pojo.Goods1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 2019/10/2615:48
 * <p>
 * 未知的事情 永远充满变数
 */
@Service
public class Goods1ServiceImpl implements Goods1Service {

    @Autowired
    private Goods1DAO goods1DAO;
    @Override
    public void insertGoods(Goods1 goods1) {
        System.out.println("业务下传："+goods1);
       //goods1DAO.insertGoods(goods1);

        goods1DAO.insertGoods(goods1.getTitle(),goods1.getImapath(),goods1.getPrice());
    }
}
