package com.example.codefellowship1.repository;


import com.example.codefellowship1.models.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationUserRepository extends CrudRepository<Application,Integer> {
    public Application findByUsername(String username);
}
