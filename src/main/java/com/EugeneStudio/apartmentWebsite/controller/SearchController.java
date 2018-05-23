package com.EugeneStudio.apartmentWebsite.controller;

import com.EugeneStudio.apartmentWebsite.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Map;

@Controller("searchController")
@RequestMapping("/search")
public class SearchController {

    @Autowired
    @Resource(name = "searchService")
    private SearchService searchService;

    @ResponseBody
    @RequestMapping(value = "/room", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    public Object searchRoom(@RequestBody Map<String, Object> requestMap) {
        String continent = requestMap.get("continent").toString().trim();
        //System.out.println(continent);
        String country = requestMap.get("country").toString().trim();
        //System.out.println(country);
        String status = requestMap.get("status").toString().trim();
        //System.out.println(status);
        String type = requestMap.get("type").toString().trim();
        //System.out.println(type);
        int bed = Integer.parseInt(requestMap.get("bed").toString().trim());
        int bathroom = Integer.parseInt(requestMap.get("bathroom").toString().trim());
        int minPrice = Integer.parseInt(requestMap.get("minPrice").toString().trim());
        int maxPrice = Integer.parseInt(requestMap.get("maxPrice").toString().trim());
        return searchService.findRooms(continent, country, status, type, bed, bathroom, minPrice, maxPrice);
    }
}
