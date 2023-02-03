package br.com.ifs.projetoWeb.controllers;


import br.com.ifs.projetoWeb.dto.CategoriaDto;
import br.com.ifs.projetoWeb.dto.TorneioDto;
import br.com.ifs.projetoWeb.model.Categoria;
import br.com.ifs.projetoWeb.model.Torneio;
import br.com.ifs.projetoWeb.model.Usuario;
import br.com.ifs.projetoWeb.service.CategoriaServise;
import br.com.ifs.projetoWeb.service.TorneioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.stream.Collectors;


@RestController
    @RequestMapping(value = "/torneios")
    @CrossOrigin(origins ="http://localhost:4200")
    public class TorneioController {
        @Autowired
        private TorneioService service;

        @Autowired
        private CategoriaServise categoriaServise;
        //Consultar todas categorias de um torneio
        @GetMapping()
        public ResponseEntity<List<Torneio>> findAll() {
            List<Torneio> list = service.findAll();
            return ResponseEntity.ok().body(list);
        }
        //Consultar por ID
        @GetMapping(value = "/{id}")
        public ResponseEntity<Torneio> findById(@PathVariable Integer id) {
            Torneio obj = service.findById(id);
            return ResponseEntity.ok().body(obj);
        }
        @GetMapping(value = "/{id}/categorias")
        public ResponseEntity<List<Categoria>> findAllCategoriaByTorneio(@PathVariable Integer id) {
            var obj = service.findById(id).getCategorias();
            return ResponseEntity.ok().body(obj);

        }

    }













