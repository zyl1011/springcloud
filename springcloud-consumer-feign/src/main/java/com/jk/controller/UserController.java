package com.jk.controller;

import com.jk.model.Goods;
import com.jk.model.Tree;
import com.jk.service.UserServiceFeign;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Resource
    private UserServiceFeign userServiceFeign;


    @RequestMapping("test")
    public void test(){
        userServiceFeign.test();
    }

    @RequestMapping("queryTree")
    @ResponseBody
    public List<Tree> queryTree(){
        return userServiceFeign.queryTree();
    }

    //跳主页
    @RequestMapping("toIndex")
    public String toInde(){
        return "index";
    }

    //商品查询  分页
    @RequestMapping("queryGoods")
    @ResponseBody
    public HashMap<String,Object> queryGoods(Integer page, Integer rows){
        return userServiceFeign.queryGoods(page,rows);
    }

    //跳查询页
    @RequestMapping("toquery")
    public String toquery(){
        return "query";
    }


}
