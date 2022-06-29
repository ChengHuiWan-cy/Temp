package com.example.backend.dao;

import com.example.backend.entity.spotcomment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface spotcommentRepository extends JpaRepository<spotcomment, String> {
}
