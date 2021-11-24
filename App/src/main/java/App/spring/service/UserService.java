package App.spring.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import App.spring.controller.dto.UserRegistrationDto;
import App.spring.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
