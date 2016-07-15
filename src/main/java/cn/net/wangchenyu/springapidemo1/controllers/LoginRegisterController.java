package cn.net.wangchenyu.springapidemo1.controllers;

import cn.net.wangchenyu.springapidemo1.models.CreateFood;
import cn.net.wangchenyu.springapidemo1.models.CreateFoodDao;
import cn.net.wangchenyu.springapidemo1.models.ReturnMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cheneyveron on 7/7/16.
 */
@RestController
public class LoginRegisterController {

    @Autowired
    private CreateFoodDao createFoodDao;

    @RequestMapping("/login")
    public String Login(){
        return "success";
    }

}