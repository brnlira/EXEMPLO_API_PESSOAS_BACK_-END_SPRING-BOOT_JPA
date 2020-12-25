package com.brunomarqueslira.mysite.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brunomarqueslira.mysite.domain.Users;
import com.brunomarqueslira.mysite.services.UsersService;

@RestController
@RequestMapping(value="/users")
public class UsersResource {

	@Autowired
	private UsersService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Optional<Users> obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}
}