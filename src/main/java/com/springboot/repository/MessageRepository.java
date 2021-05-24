package com.springboot.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.model.Message;
import com.springboot.model.User;



public interface MessageRepository extends JpaRepository<Message,Integer>
{
    
    List<Message> findByUser(User user);    
}