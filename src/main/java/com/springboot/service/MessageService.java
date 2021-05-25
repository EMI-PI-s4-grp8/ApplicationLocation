package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Message;
import com.springboot.model.User;
import com.springboot.repository.MessageRepository;



@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;
    
    public List<Message> messageList(User user) {

        return messageRepository.
                findByUser(
                    user
                );
    }

    public void saveMessage(User user,
                            Message message){
        message.setUser(
            user
        );
        messageRepository.save(message);
        
    }
}