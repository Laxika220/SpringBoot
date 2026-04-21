package com.example.demo.repository;

import com.example.demo.model.menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface menuRepo extends JpaRepository<menu, Integer> {
}