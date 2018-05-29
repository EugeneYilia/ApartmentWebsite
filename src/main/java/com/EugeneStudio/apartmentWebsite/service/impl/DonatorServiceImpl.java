package com.EugeneStudio.apartmentWebsite.service.impl;

import com.EugeneStudio.apartmentWebsite.mapper.DonatorMapper;
import com.EugeneStudio.apartmentWebsite.model.Donator;
import com.EugeneStudio.apartmentWebsite.service.DonatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("donatorService")
public class DonatorServiceImpl implements DonatorService {

    @Autowired
    private DonatorMapper donatorMapper;

    @Override
    public boolean recordDonator(Donator donator) {
        int number = donatorMapper.insert(donator);
        if (number == 1) {
            return true;
        } else {
            return false;
        }
    }
}
