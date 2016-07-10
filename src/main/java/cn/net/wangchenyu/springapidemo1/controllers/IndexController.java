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
public class IndexController {

    @Autowired
    private CreateFoodDao createFoodDao;

    @RequestMapping("/")
    public String indexShow(){
        return "Hello Cheney!";
    }

    @RequestMapping("/create")
    public Object create(){
        CreateFood createFood = new CreateFood();
        createFood.setName("fruit");
        return createFoodDao.save(createFood);
    }

    @RequestMapping("/showall")
    public Object showAll(){
        return createFoodDao.findAll();
    }

    @RequestMapping(value = "/verify")
    public Object verify(@RequestParam(value = "id",defaultValue = "-1") String stringId){
        long id = -1;
        try{
            id = Integer.parseInt(stringId);
        }catch (Exception e){
            id = -1;
        }
        CreateFood createFood = createFoodDao.findOne(id);
        ReturnMessage returnMessage = new ReturnMessage();
        if(id < 0){
            returnMessage.setId(2);
            returnMessage.setMessage("ID Illegal");
        }else if(createFood == null){
            returnMessage.setId(1);
            returnMessage.setMessage("ID Not Found");
        }else{
            returnMessage.setId(0);
            returnMessage.setMessage("Today we eat "+createFood.getName());
        }
        return returnMessage;
    }
}