package com.sorting.example.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sorting.example.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
  }
