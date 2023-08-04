package com.example.AssignmnetAPI.Dao;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.AssignmnetAPI.Entity.User;

public interface Dao extends JpaRepository<User,String>{


}
