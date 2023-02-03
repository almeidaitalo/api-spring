package br.com.ifs.projetoWeb.controllers;

import br.com.ifs.projetoWeb.model.Usuario;
import br.com.ifs.projetoWeb.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;


@RestController
@RequestMapping("/usuario")
public class UsuarioControllers {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/salvar")
    public ResponseEntity<Usuario> Cadastrar(@RequestBody Usuario usuario) {
        usuario.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.ok(usuarioService.criar(usuario));
    }
    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> getAllUsuario(){
        return ResponseEntity.status(HttpStatus.OK).body(usuarioService.findAll());
    }
}

