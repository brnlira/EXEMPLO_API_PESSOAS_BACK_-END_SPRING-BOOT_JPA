package com.brunomarqueslira.mysite.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.brunomarqueslira.mysite.domain.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer>{
	
}
