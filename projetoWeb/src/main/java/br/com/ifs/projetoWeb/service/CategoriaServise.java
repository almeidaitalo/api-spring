package br.com.ifs.projetoWeb.service;

import br.com.ifs.projetoWeb.model.Categoria;
import br.com.ifs.projetoWeb.repository.CategoriaRepository;
import br.com.ifs.projetoWeb.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServise {

    @Autowired
    private CategoriaRepository repository;

    public Categoria findById(Integer id) {
        Optional<Categoria> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id" + id + ", Tipo: " + Categoria.class.getName()));
    }
    public List<Categoria> findAll() {
        return repository.findAll();
    }

}