package com.example.apidemo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepo extends JpaRepository<User,Integer> {
    List<User> findByName(String name);
}
