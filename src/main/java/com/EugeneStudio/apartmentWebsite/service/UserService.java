package com.EugeneStudio.apartmentWebsite.service;

public interface UserService {
    boolean findUser(String email, String password);
    boolean registerUser(String email, String password);
}
