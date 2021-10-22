package com.example.codefellowship1.controllers;


import com.example.codefellowship1.models.AppUser;
import com.example.codefellowship1.models.Post;
import com.example.codefellowship1.repository.AppUserRepository;
import com.example.codefellowship1.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.security.Principal;
import java.sql.Timestamp;

@Controller
public class PostController {
    @Autowired
    PostRepository postRepository;

    @Autowired
    AppUserRepository appUserRepository;

    @PostMapping("/posts")
    public RedirectView createPost(Principal p, Model m, String body){
        AppUser user = appUserRepository.findByUsername(p.getName());

        if(user != null){
            Timestamp timestamp = new Timestamp(System.currentTimeMillis());
            Post post = new Post(body, timestamp, user);
            postRepository.save(post);
        }

        m.addAttribute("principal", p.getName());
        m.addAttribute("appUser", user);
        return new RedirectView("/myprofile");
    }

    @GetMapping("/post")
    public String getPostPage() {
        return "postpage";
    }

}
