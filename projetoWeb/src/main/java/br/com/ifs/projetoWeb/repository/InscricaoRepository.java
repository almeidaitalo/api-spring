package br.com.ifs.projetoWeb.repository;

import br.com.ifs.projetoWeb.model.Inscricao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InscricaoRepository extends JpaRepository<Inscricao, Integer> {

}