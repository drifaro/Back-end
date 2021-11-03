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

import br.org.generation.DriBlog.model.ModelTema;
import br.org.generation.DriBlog.repository.RepositoryTema;

@RestController
@RequestMapping("/tema")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ControllerTema {

	@Autowired
	private RepositoryTema repositorytema;

	@GetMapping
	public ResponseEntity<List<ModelTema>> getALL() {
		return ResponseEntity.ok(repositorytema.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<ModelTema> gteById(@PathVariable long id) {
		return repositorytema.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<ModelTema>> getByName(@PathVariable String descricao) {
		return ResponseEntity.ok(repositorytema.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	@PostMapping
	public ResponseEntity<ModelTema> postTema(@RequestBody ModelTema tema) {
		return ResponseEntity.ok(repositorytema.save(tema));
	}

	@PutMapping
	public ResponseEntity<ModelTema> putTema (@RequestBody ModelTema tema){
		return ResponseEntity.status(HttpStatus.OK).body(repositorytema.save(tema));
		
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repositorytema.deleteById(id);
	}
}
