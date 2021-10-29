package br.org.generation.DriBlog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.DriBlog.model.ModelBlog;
import br.org.generation.DriBlog.repository.RepositoryBlog;

@RestController
@RequestMapping ("/DriBlog")
@CrossOrigin (origins = "*", allowedHeaders = "*")

public class ControllerBlog {

	@Autowired
		private RepositoryBlog repositoryBlog;
	
	@GetMapping
		public ResponseEntity<List<ModelBlog>> getAll(){
			return ResponseEntity.ok(repositoryBlog.findAll());		
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ModelBlog> GetByid(@PathVariable long id){
		return repositoryBlog.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<ModelBlog>> GetByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repositoryBlog.findAllByTituloContainingIgnoreCase(titulo));
	}
	
	@PostMapping
	public ResponseEntity<ModelBlog> post (@RequestBody ModelBlog tabBlog){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryBlog.save(tabBlog));
		
	}
	@PutMapping
	public ResponseEntity<ModelBlog> put (@RequestBody ModelBlog tabBlog){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryBlog.save(tabBlog));
		
	}
	@DeleteMapping ("/{id}")
	public void delete(@PathVariable long id) {
		repositoryBlog.deleteById(id);
	}

}
