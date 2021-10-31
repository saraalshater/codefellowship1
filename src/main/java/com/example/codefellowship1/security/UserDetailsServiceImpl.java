package com.example.codefellowship1.security;


import com.example.codefellowship1.models.Application;
import com.example.codefellowship1.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    ApplicationUserRepository applicationUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username)
            throws UsernameNotFoundException {
        Application applicationUser =
                applicationUserRepository.findByUsername(username);


        if (applicationUser == null) {
            throw new UsernameNotFoundException(username + " does not exist");
        }
        return applicationUser;
    }
}