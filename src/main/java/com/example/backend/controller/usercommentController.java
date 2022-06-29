package com.example.backend.controller;

import com.example.backend.dao.usercommentRepository;
import com.example.backend.entity.usercomment;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
@CrossOrigin
@RestController
public class usercommentController extends WebMvcConfigurationSupport {
    @Autowired
    usercommentRepository usercommentRepository1;

    @GetMapping("/usercomment/findAll")
    public result usercommentFindAll() {
        return result.ok(usercommentRepository1.findAll());
    }
    @GetMapping("/usercomment/findBy")
    public result usercommentFindBy(String name)
    {
        return result.ok(usercommentRepository1.findByUsername(name));
    }
    @GetMapping("/usercomment/add")
    public result usercommentAdd(
            String username, String comment, String time, String spot) {
        usercomment usercomment1 = new usercomment();
        usercomment1.setUsername(username);
        usercomment1.setComment(comment);
        usercomment1.setTime(time);
        usercomment1.setSpot(spot);
        System.out.println(usercomment1.getComment());
        usercommentRepository1.save(usercomment1);
        return usercommentFindAll();
    }

}
