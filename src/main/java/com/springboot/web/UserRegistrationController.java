package com.springboot.web;

	import java.util.List;

	import javax.validation.Valid;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.validation.BindingResult;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.ModelAttribute;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestMapping;

import com.springboot.model.Role;
import com.springboot.model.User;
import com.springboot.repository.RoleRepository;
import com.springboot.service.UserService;
import com.springboot.web.dto.UserRegistrationDto;

	
	@Controller
	@RequestMapping("/registration")
	public class UserRegistrationController {
	    
	    @Autowired
	    private UserService userService;
	    @Autowired
	    private RoleRepository roleRepository;
	    
	    @ModelAttribute("user")
	    public UserRegistrationDto userRegistrationDto(){
	        return new UserRegistrationDto();
	    }

	    @ModelAttribute("rolesList")
	    public List<Role> listOfRoles(){
	        return roleRepository.findAll();
	    }

	    @GetMapping
	    public String showRegistrationForm(Model model){
	        return "registration";
	    }
	    
	    @PostMapping
	    public String registerUserAccount(
	        @ModelAttribute("user")
	        @Valid UserRegistrationDto userDto,
	        BindingResult result){

	            User existing = userService.findByEmail(userDto.getEmail());
	            if(existing!=null){
	                result.rejectValue("email", null,
	                "There is already an account registred with that email");
	            }
	            System.out.print("result.hasErrors():"+result.hasErrors());
	            if(result.hasErrors()){
	                return "registration";
	            }

	            userService.saveUser(userDto);

	            return "redirect:/registration?success";
	        }
	}

