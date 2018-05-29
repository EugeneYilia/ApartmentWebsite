package com.EugeneStudio.apartmentWebsite.controller;

import com.EugeneStudio.apartmentWebsite.model.Donator;
import com.EugeneStudio.apartmentWebsite.service.DonatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller("donatorController")
@RequestMapping("/donator")
public class DonatorController {
    @Autowired
    @Resource(name = "donatorService")
    private DonatorService donatorService;

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public Object addDonator(@RequestBody Map<String, Object> requestMap) {
        String firstName = requestMap.get("FirstName").toString().trim();
        String lastName = requestMap.get("LastName").toString().trim();
        String cardType = requestMap.get("CardType").toString().trim();
        String cardNumber = requestMap.get("CardNumber").toString().trim();
        String code = requestMap.get("Code").toString().trim();
        String amount = requestMap.get("Amount").toString().trim();
        String email = requestMap.get("Email").toString().trim();

        Donator donator = new Donator();
        donator.setFirstName(firstName);
        donator.setLastName(lastName);
        donator.setCardType(cardType);
        donator.setCardNumber(cardNumber);
        donator.setCode(code);
        donator.setAmount(amount);
        donator.setEmail(email);

        return  donatorService.recordDonator(donator);
    }
}
