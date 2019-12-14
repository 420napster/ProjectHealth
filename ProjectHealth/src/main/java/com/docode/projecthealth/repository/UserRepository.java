package com.docode.projecthealth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.docode.projecthealth.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByMobileNumber(String number);
}
