package com.example.backend.controller;

import com.example.backend.dao.userinfoRepository;
import com.example.backend.entity.forLogin;
import com.example.backend.entity.userinfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityNotFoundException;
import java.io.*;

@CrossOrigin
@RestController
public class userinfoController {
    @Autowired
    userinfoRepository userinfoRepository1;
//    @Autowired
//    forLoginRepository forLoginRepository1;
    @GetMapping("/userinfo/findOne")
    public result userinfoFindOne(String username,String password) throws IOException {
        userinfo userinfo1=userinfoRepository1.findById(username).orElseThrow(()->new EntityNotFoundException());
        if(userinfo1.getPassword().equals(password))
        {
            String fileName="B:\\CodesOfIDEA\\backend\\src\\main\\java\\com\\example\\backend\\username.txt";
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
            writer.write(username);
            writer.close();
            return result.ok(userinfo1.getPassword().equals(password));
        }
        return result.error(userinfo1.getPassword().equals(password));
    }
    @GetMapping("/userinfo/getUserName")
    public result getUsername() throws IOException {
        String fileName="B:\\CodesOfIDEA\\backend\\src\\main\\java\\com\\example\\backend\\username.txt";
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        reader.close();
	return result.ok(reader.readLine());
    }
    @GetMapping("/userinfo/info")
    public result userinfoInfo()
    {
        forLogin forLogin1=new forLogin();
        forLogin1.setAvatar("https://wpimg.wallstcn.com/f778738c-e4f8-4870-b634-56703b4acafe.gif?imageView2/1/w/80/h/80");
        forLogin1.setIntroduction("what");
        forLogin1.setName("what");
        return result.ok(forLogin1);
    }
}
