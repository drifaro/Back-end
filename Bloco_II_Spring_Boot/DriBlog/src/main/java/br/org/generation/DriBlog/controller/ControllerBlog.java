package br.org.generation.DriBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.DriBlog.model.tabelasBlog;
import br.org.generation.DriBlog.repository.RepositoryBlog;

@RestController
@RequestMapping ("/DriBlog")
@CrossOrigin (origins = "*", allowedHeaders = "*")

public class ControllerBlog {

	@Autowired
		private RepositoryBlog repositoryBlog;
	
	@GetMapping
		public ResponseEntity<List<tabelasBlog>> getAll(){
			return ResponseEntity.ok(repositoryBlog.findAll());
		
	}

}
