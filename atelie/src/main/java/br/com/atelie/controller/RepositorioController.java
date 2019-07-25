package br.com.atelie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.atelie.model.Repositorio;
import br.com.atelie.repository.RepositorioRepository;

@RestController
public class RepositorioController {
	
	@Autowired
	private RepositorioRepository repoR;
	
	@GetMapping("/add")
	public String saveRepositorio() {
		Repositorio repo = new Repositorio();
		
		repo.setNome("Java");
		repo.setDetalhes("TESTE");
		repoR.save(repo);
		
		return "Saved";
	}
}
