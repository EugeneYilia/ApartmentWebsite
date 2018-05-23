package com.EugeneStudio.apartmentWebsite.controller;

import com.EugeneStudio.apartmentWebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Autowired
    @Resource(name = "userService")
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/login", produces = "application/json;charset=utf-8")
    public Object login(@RequestBody Map<String, Object> requestMap) {
        String email = requestMap.get("email").toString().trim();
        String password = requestMap.get("password").toString().trim();
        boolean isExist = userService.findUser(email, password);
        if (isExist) {
            return true;
        } else {
            return false;
        }
    }

    @ResponseBody
    @RequestMapping(value = "/register", produces = "application/json;charset=utf-8")
    public Object register(@RequestBody Map<String, Object> requestMap) {
        String email = requestMap.get("email").toString().trim();
        String password = requestMap.get("password").toString().trim();
        boolean isSuccessful = userService.registerUser(email, password);
        if (isSuccessful) {
            return true;
        } else {
            return false;
        }
    }
}
