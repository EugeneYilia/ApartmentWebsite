package com.EugeneStudio.apartmentWebsite.controller;

import com.EugeneStudio.apartmentWebsite.model.RoomKey;
import com.EugeneStudio.apartmentWebsite.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;
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
        //System.out.println(bed);

        int bathroom = Integer.parseInt(requestMap.get("bathroom").toString().trim());
        //System.out.println(bathroom);

        int minPrice = Integer.parseInt(requestMap.get("minPrice").toString().trim());
        //System.out.println(minPrice);

        int maxPrice = Integer.parseInt(requestMap.get("maxPrice").toString().trim());
        //System.out.println(maxPrice);

        /*
        List<RoomKey> roomKeyList = searchService.findRooms(continent, country, status, type, bed, bathroom, minPrice, maxPrice);
        System.out.println("#########################RoomKeyList START####################################");
        for (int i = 0; i < roomKeyList.size(); i++) {
            System.out.print(roomKeyList.get(i).getContinent() + " " + roomKeyList.get(i).getCountry() + " " + roomKeyList.get(i).getStatus() + " ");
            System.out.print(roomKeyList.get(i).getLocation() + " " + roomKeyList.get(i).getType() + " " + roomKeyList.get(i).getBed());
            System.out.print(roomKeyList.get(i).getBathroom() + " " + roomKeyList.get(i).getPrice() + " " + roomKeyList.get(i).getImageurl());
            System.out.println();
        }
        System.out.println("#########################RoomKeyList END######################################");
        */
        return searchService.findRooms(continent, country, status, type, bed, bathroom, minPrice, maxPrice);
    }
}
