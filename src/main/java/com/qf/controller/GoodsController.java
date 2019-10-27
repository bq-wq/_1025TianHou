package com.qf.controller;

import com.qf.pojo.Goods1;
import com.qf.service.Goods1Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * 2019/10/2614:30
 * <p>
 * 未知的事情 永远充满变数
 */
@Controller
@RequestMapping("/goods")
public class GoodsController {

        @Autowired
        private Goods1Service goods1Service;

    @GetMapping("/goods")
    String goodsAdd(){
        System.out.println("去上传页面！");
        return "forward:/WEB-INF/goodsAdd.jsp";
    }


    @PostMapping("/test1")
    public String hello1(Goods1 goods1, MultipartFile source, HttpSession session){
            //文件原始名称
        String filename = source.getOriginalFilename();
        goods1.setImapath("goods/"+filename);
        System.out.println(goods1);


        //将上传的文件 存入磁盘路径中
        //source。transferTo(new File(real_path+"\\"+uniqueFileName))
        try {
            goods1Service.insertGoods(goods1);
            source.transferTo(new File("E:\\第三阶段\\1021天第23天\\Tian\\src\\main\\webapp\\images\\goods\\"+ filename));
                                            // E:\第三阶段\1021天第23天\Tian\src\main\webapp\images\goods
            System.out.println("上传成功");                     //
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }


    @RequestMapping("select")
    public String select(HttpServletRequest request){

        List<Goods1> list = goods1Service.selectAll();
        request.setAttribute("list",list );

        return "forward:/WEB-INF/goodsall.jsp";
    }


    @GetMapping("update")
    public String up(int id,HttpServletRequest request){
        System.out.println(id);
        Goods1 goods1 = goods1Service.selectById(id);

        System.out.println("go to update!");
        request.setAttribute("goods1",goods1 );
        return "forward:/WEB-INF/update.jsp";
    }

    @RequestMapping("update")
    public String updateGoods(Goods1 goods1, MultipartFile source, HttpServletRequest request, HttpServletResponse response){
        //通过id修改商品
        System.out.println(goods1);
        System.out.println(source);
        //获取文件名称
        String fileName = source.getOriginalFilename();
        System.out.println(fileName);
        //定义全局唯一标识
        String uuid = UUID.randomUUID().toString();
        //sing 全局唯一标识
        String uniqueName = uuid+fileName;
        System.out.println(uniqueName);

       /* String imapath = goods1.getImapath();
        //获取图片名称
        String im = imapath.split("/")[1];
            */
        goods1.setImapath("goods/"+fileName);
        System.out.println(goods1);



        try {
            goods1Service.updateGoods(goods1);
            source.transferTo(new File("E:\\第三阶段\\1021天第23天\\Tian\\src\\main\\webapp\\images\\goods\\"+ fileName));
            // E:\第三阶段\1021天第23天\Tian\src\main\webapp\images\goods
            System.out.println("上传成功");                     //
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }



}
