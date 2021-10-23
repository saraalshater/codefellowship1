package com.example.codefellowship1.repository;

import com.example.codefellowship1.models.AppUser;
import com.example.codefellowship1.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Set;

public interface PostRepository extends JpaRepository<Post, Long> {

    List<Post> findByAppUserIn(Set<AppUser> appUserList);
}
