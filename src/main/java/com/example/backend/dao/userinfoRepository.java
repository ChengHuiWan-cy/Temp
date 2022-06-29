package com.example.backend.dao;
import com.example.backend.entity.userinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userinfoRepository extends JpaRepository<userinfo,String> {
}
