package br.org.generation.DriBlog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.DriBlog.model.tabelasBlog;

@Repository
public interface RepositoryBlog extends JpaRepository<tabelasBlog, Long>{

}
