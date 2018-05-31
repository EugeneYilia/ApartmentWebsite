package com.EugeneStudio.apartmentWebsite.service.impl;

import com.EugeneStudio.apartmentWebsite.mapper.RoomMapper;
import com.EugeneStudio.apartmentWebsite.model.RoomKey;
import com.EugeneStudio.apartmentWebsite.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("searchService")
public class SearchServiceImpl implements SearchService {

    @Autowired
    private RoomMapper roomMapper;

    @Override
    public List<RoomKey> findRooms(String area, String country, String property_status, String property_type, int bed, int bathroom, int minPrice, int maxPrice) {
        return roomMapper.selectRooms(area, country, property_status, property_type, bed, bathroom, minPrice, maxPrice);
    }
}
