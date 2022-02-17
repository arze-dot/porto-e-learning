package com.portfolio.elearning.service;

import com.portfolio.elearning.entity.MyUserDetails;
import com.portfolio.elearning.entity.Users;
import com.portfolio.elearning.repository.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    private UsersRepo usersRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> users = Optional.ofNullable(usersRepo.findByUsername(username));
        return  users.map(MyUserDetails::new).get();
    }
}
