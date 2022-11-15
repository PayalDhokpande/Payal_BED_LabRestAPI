package com.greatlearning.collegefest.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.greatlearning.collegefest.entity.User;
import com.greatlearning.collegefest.repository.UserRepository;
import com.greatlearning.collegefest.security.MyUserDetails;



public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	public UserDetails loadUserByUsername(String Username) throws UsernameNotFoundException{
		User user = userRepository.findByUsername(Username);
		if(user == null)
			throw new UsernameNotFoundException("Could not find user ");
		return new MyUserDetails(user);
	}
}