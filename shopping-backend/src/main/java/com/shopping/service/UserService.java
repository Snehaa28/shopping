package com.shopping.service;

import com.shopping.entity.User;
import com.shopping.model.CustomerNumber;
import com.shopping.repository.UserRepository;
import com.shopping.utils.UserIdGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final UserIdGenerator userIdGenerator;

    public CustomerNumber saveUser(User user) {
        userRepository.save(user).getId();
        return CustomerNumber.builder()
                .customerNumber(userIdGenerator.userIdGenerator())
                .build();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }
        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(),
                new ArrayList<>());
    }
}
