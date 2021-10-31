package com.example.codefellowship1.repository;


import com.example.codefellowship1.models.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Integer> {
//    List<Post> findAllByUser (ApplicationUser applicationUser);
}
