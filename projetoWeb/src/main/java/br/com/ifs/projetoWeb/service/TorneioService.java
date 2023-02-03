package br.com.ifs.projetoWeb.service;


import br.com.ifs.projetoWeb.model.Torneio;
import br.com.ifs.projetoWeb.model.Usuario;
import br.com.ifs.projetoWeb.repository.TorneioRepository;
import br.com.ifs.projetoWeb.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class TorneioService {

    @Autowired
    private TorneioRepository repository;

    @Autowired
    private CategoriaServise servise;

    public Torneio findById(Integer id) {
        Optional<Torneio> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id" + id + ", Tipo: " + Torneio.class.getName()));

    }
    public List<Torneio> findAll() {
        return repository.findAll();
    }

    }


