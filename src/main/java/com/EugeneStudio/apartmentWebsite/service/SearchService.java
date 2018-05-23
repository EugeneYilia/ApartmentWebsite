package com.EugeneStudio.apartmentWebsite.service;

import com.EugeneStudio.apartmentWebsite.model.RoomKey;

import java.util.List;

public interface SearchService {
    List<RoomKey> findRooms(String area, String country, String property_status, String property_type, int bed, int bath, int minPrice,int maxPrice);
}
