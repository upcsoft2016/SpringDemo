package cn.net.wangchenyu.springapidemo1.controllers;

import cn.net.wangchenyu.springapidemo1.models.CreateFood;
import cn.net.wangchenyu.springapidemo1.models.CreateFoodDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luxin on 2016/7/14.
 */
@RestController
public class LuXinController {
    @Autowired
    private CreateFoodDao createDeptDao;

    @RequestMapping("/user")
    public Object luXinHero(String name) {
        CreateFood l = new CreateFood();
        l.setName(name);
        return createDeptDao.save(l);
    }
}

