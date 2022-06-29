package com.example.backend.dao;

import com.example.backend.entity.usercomment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface usercommentRepository extends JpaRepository<usercomment, String> {
    List<usercomment> findByUsername(String username);
}
