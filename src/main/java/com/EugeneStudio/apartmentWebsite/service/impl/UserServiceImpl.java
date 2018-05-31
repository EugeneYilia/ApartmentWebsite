package com.EugeneStudio.apartmentWebsite.service.impl;

import com.EugeneStudio.apartmentWebsite.mapper.UserMapper;
import com.EugeneStudio.apartmentWebsite.model.User;
import com.EugeneStudio.apartmentWebsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean findUser(String email, String password) {
        User user = userMapper.selectUser(email, password);
        if (user == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public boolean registerUser(String email, String password) {
        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        int count = userMapper.insert(user);
        if (count != 0) {
            return true;//插入返回数量不为0，表示插入成功
        } else {
            return false;
        }
    }
}
