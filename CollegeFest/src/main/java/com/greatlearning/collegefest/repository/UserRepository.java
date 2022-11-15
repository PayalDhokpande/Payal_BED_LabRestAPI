package com.greatlearning.collegefest.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.greatlearning.collegefest.entity.User;



@Repository
public interface UserRepository extends JpaRepository<User,Integer>
{
	public User findByUsername(String username);

}
