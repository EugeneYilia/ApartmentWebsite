package com.EugeneStudio.apartmentWebsite;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.EugeneStudio.apartmentWebsite.mapper")
public class ApartmentWebsiteApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApartmentWebsiteApplication.class, args);
    }
}