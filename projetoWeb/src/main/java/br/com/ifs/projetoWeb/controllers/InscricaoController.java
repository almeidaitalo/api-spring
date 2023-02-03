package br.com.ifs.projetoWeb.controllers;


import br.com.ifs.projetoWeb.repository.UsuarioRepository;
import br.com.ifs.projetoWeb.service.InscricoesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/inscricao")
public class InscricaoController{

    @Autowired
    private InscricoesService inscricoesService;
   @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping("/{idCategoria}/incricao")
    public ResponseEntity<?> criar(@PathVariable("idCategoria") int Categoriaid, @RequestHeader("Authorization") String token,
                                    @RequestParam String login) {

        var usuario = usuarioRepository.findByLogin(login);
        if (usuario.isPresent()) {
            var incricao = inscricoesService.criar(Categoriaid, token, usuario.get());
            return ResponseEntity.status(HttpStatus.CREATED).body(incricao);
        }
        else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Falha na inscrição");

        }

    }

}
