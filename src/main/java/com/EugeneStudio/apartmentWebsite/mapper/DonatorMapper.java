package com.EugeneStudio.apartmentWebsite.mapper;

import com.EugeneStudio.apartmentWebsite.model.Donator;

public interface DonatorMapper {
    int insert(Donator record);

    int insertSelective(Donator record);
}