package br.com.ifs.projetoWeb.repository;

import br.com.ifs.projetoWeb.model.Torneio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TorneioRepository extends JpaRepository<Torneio, Integer> {

}