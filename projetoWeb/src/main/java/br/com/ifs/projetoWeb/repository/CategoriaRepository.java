package br.com.ifs.projetoWeb.repository;

import br.com.ifs.projetoWeb.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer > {

}
