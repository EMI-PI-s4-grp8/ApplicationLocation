package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.springboot.model.User;
import com.springboot.repository.UserRepository;
import com.springboot.web.dto.UserRegistrationDto;



@Service
public class UserService {
    
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    public void saveUser(UserRegistrationDto userRegistrationDto){
        User user = new User();
        
        StringBuilder name = new StringBuilder(
                            userRegistrationDto.getFirstName());
        StringBuilder name1 = new StringBuilder(
                userRegistrationDto.getLastName());
       
        user.setFirstName(name.toString());
        user.setLastName(name1.toString());
        
        user.setEmail(userRegistrationDto.getEmail());
        user.setPassword(passwordEncoder.encode(
                            userRegistrationDto
                            .getPassword()));
        user.setRoles(userRegistrationDto.getRoles());

        userRepository.save(user);
    }

    public User findByEmail(String email){
        User user=null;
        try {
            user =userRepository.
                    findByEmail(email).get();
    
        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
                            
    }


                         
}