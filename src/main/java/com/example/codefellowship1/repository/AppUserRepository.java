package com.example.codefellowship1.repository;

import com.example.codefellowship1.models.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository  extends JpaRepository<AppUser, Long> {

    AppUser findByUsername(String username);
    AppUser findById(long id);

}
