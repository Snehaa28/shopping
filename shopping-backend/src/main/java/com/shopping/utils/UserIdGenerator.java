package com.shopping.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class UserIdGenerator {

    public String userIdGenerator(){
        Random rnd = new Random(System.currentTimeMillis());
        return "R" + (rnd.nextInt(900) + 100);
    }
}
