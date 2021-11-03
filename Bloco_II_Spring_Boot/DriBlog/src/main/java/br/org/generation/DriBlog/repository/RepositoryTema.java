package br.org.generation.DriBlog.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.DriBlog.model.ModelTema;

public interface RepositoryTema extends JpaRepository<ModelTema, Long> {
	public List<ModelTema> findAllByDescricaoContainingIgnoreCase( String Descricao);
}
