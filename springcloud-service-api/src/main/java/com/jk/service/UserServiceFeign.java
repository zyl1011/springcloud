package com.jk.service;

import com.jk.model.Goods;
import com.jk.model.Tree;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;

@FeignClient("provider-user")
public interface UserServiceFeign {

    @GetMapping("test")
    void test();

    @GetMapping("queryTree")
    List<Tree> queryTree();

    @GetMapping("queryGoods")
    HashMap<String, Object> queryGoods(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows);
}
