package com.EugeneStudio.apartmentWebsite.mapper;

import com.EugeneStudio.apartmentWebsite.model.RoomKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoomMapper {
    int deleteByPrimaryKey(RoomKey key);

    int insert(RoomKey record);

    int insertSelective(RoomKey record);

    List<RoomKey> selectRooms(@Param("continent") String continent,@Param("country") String country,@Param("status") String status,@Param("type") String type,@Param("bed") int bed,@Param("bathroom") int bathroom,@Param("minPrice") int minPrice, @Param("maxPrice") int maxPrice);
}