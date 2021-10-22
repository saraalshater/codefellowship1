package com.example.codefellowship1.repository;

import com.example.codefellowship1.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
