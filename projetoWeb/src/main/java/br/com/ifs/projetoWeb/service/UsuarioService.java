package br.com.ifs.projetoWeb.service;

import br.com.ifs.projetoWeb.model.Usuario;
import br.com.ifs.projetoWeb.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private PasswordEncoder encoder;

    public Usuario criar (Usuario usuario){
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return usuarioRepository.save(usuario);
    }
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();

    }

}
