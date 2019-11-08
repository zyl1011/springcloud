package com.jk.controller;

import com.jk.model.Goods;
import com.jk.model.Tree;
import com.jk.service.UserService;
import com.jk.service.UserServiceFeign;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

@RestController
public class UserController implements UserServiceFeign {

    @Resource
    private UserService userService;

    @GetMapping("test")
    public void test() {
        System.out.println("进来了");
    }

    @GetMapping("queryTree")
    public List<Tree> queryTree() {
        return userService.queryTree();
    }

    @GetMapping("queryGoods")
    public HashMap<String, Object> queryGoods(@RequestParam("page") Integer page, @RequestParam("rows")Integer rows) {
        return userService.queryGoods(page,rows);
    }
}
