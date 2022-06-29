package com.example.backend.controller;

import com.example.backend.dao.spotcommentRepository;
import com.example.backend.entity.spotcomment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@CrossOrigin
@RestController
public class spotcommentController {
    @Autowired
    spotcommentRepository spotcommentRepository1;
    @GetMapping("/spotcomment/findAll")
    public result spotcommentFindAll()
    {
        return result.ok(spotcommentRepository1.findAll());
    }
    @GetMapping("/spotcomment/add")
    public result spotcommentAdd(String spotname,String comment,String time)
    {
        spotcomment spotcomment1=new spotcomment();
        spotcomment1.setSpotname(spotname);
        spotcomment1.setComment(comment);
        spotcomment1.setTime(time);
        System.out.println(spotcomment1.getComment());
        spotcommentRepository1.save(spotcomment1);
        return spotcommentFindAll();
    }

}
