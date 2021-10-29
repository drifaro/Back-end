package br.org.generation.DriBlog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.DriBlog.model.ModelBlog;

@Repository
public interface RepositoryBlog extends JpaRepository<ModelBlog, Long>{
	
	public List<ModelBlog> findAllByTituloContainingIgnoreCase (String titulo);

}
