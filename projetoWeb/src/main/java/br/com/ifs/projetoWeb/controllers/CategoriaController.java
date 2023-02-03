package br.com.ifs.projetoWeb.controllers;


import br.com.ifs.projetoWeb.dto.CategoriaDto;
import br.com.ifs.projetoWeb.model.Categoria;
import br.com.ifs.projetoWeb.service.CategoriaServise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.List;
import java.util.stream.Collectors;

    @RestController
    @RequestMapping(value = "/cat")
    public class CategoriaController {
    @Autowired
    private CategoriaServise categoriaServise;

    //Consultar categoria por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id) {
        Categoria obj = categoriaServise.findById(id);
        return ResponseEntity.ok().body(obj);

    }
        //Consulta de todas categorias
        @GetMapping
        public ResponseEntity<List<CategoriaDto>> findAll() {
            List<Categoria> list = categoriaServise.findAll();
            List<CategoriaDto> listDTO = list.stream().map(obj -> new CategoriaDto(obj)).collect(Collectors.toList());
            return ResponseEntity.ok().body(listDTO);
        }
        }

