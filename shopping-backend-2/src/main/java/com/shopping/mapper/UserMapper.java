package com.shopping.mapper;

import com.shopping.entity.User;
import com.shopping.entity.UserMongo;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserMongo userToUserMongo(User user) {
        return UserMongo.builder()
                .id(user.getId())
                .customerName(user.getCustomerName())
                .userName(user.getUserName())
                .password(user.getPassword())
                .address(user.getAddress())
                .state(user.getState())
                .country(user.getCountry())
                .zipCode(user.getZipCode())
                .email(user.getEmail())
                .phone(user.getPhone())
                .altPhone(user.getAltPhone())
                .build();
    }
}
