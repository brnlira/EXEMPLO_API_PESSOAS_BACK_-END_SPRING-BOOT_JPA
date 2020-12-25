package com.brunomarqueslira.mysite;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunomarqueslira.mysite.domain.Pessoa;
import com.brunomarqueslira.mysite.repositories.PessoaRepository;

@SpringBootApplication
public class MySiteUserApiProjectApplication  implements CommandLineRunner{

	
	@Autowired
	private PessoaRepository pessoaRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MySiteUserApiProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Instanciações
		Pessoa p1 = new Pessoa(1, "Bruno", "Marques Lira", "XXX.XXX.XXX-XX", "27/01/1991", "A", "Rua Paris", "Apartamento 512", "123", "Perdizes", "BRA", "São Paulo", "São Paulo", "01257-040", null, null, "+55 11 9 6919-2721", "brunomarqueslira@outlook.com");
		Pessoa p2 = new Pessoa(2, "Júlio Fidel", "Marques Silva", "XXX.XXX.XXX-XX", "15/05/1996", "A", "Rua X", null, "XYZ", "XXXXXXXX", "BRA", "São Paulo", "São Bernardo do Campo", "XXXXXXXXX", null, null, "+55 11 9 7616-9009", "juliomarquesliva@outlook.com");
		pessoaRepository.saveAll(Arrays.asList(p1, p2));
	}
}