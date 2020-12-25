package com.brunomarqueslira.mysite.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunomarqueslira.mysite.domain.Users;
import com.brunomarqueslira.mysite.repositories.UsersRepository;

@Service
public class UsersService {
	
	@Autowired
	private UsersRepository repo;
	
	public Optional<Users> buscar(Integer id) {
		Optional<Users> obj = repo.findById(id);
		return obj;
	}
	
	public Optional<Users> buscar() {
		Optional<Users> obj = Optional.empty();
		return obj;
	}

}
