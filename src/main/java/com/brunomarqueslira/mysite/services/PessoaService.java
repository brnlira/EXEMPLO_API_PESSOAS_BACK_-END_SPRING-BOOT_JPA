package com.brunomarqueslira.mysite.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brunomarqueslira.mysite.domain.Pessoa;
import com.brunomarqueslira.mysite.repositories.PessoaRepository;

@Service
public class PessoaService {
	
	@Autowired
	private PessoaRepository repo;
	
	public Optional<Pessoa> buscar(Integer id) {
		Optional<Pessoa> obj = repo.findById(id);
		return obj;
	}
	
	public List<Pessoa> buscarTodos() {
		List<Pessoa> obj = repo.findAll();
		return obj;
	}

}