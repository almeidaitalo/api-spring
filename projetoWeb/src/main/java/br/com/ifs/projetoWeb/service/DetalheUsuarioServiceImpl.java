package br.com.ifs.projetoWeb.service;

import br.com.ifs.projetoWeb.model.Usuario;
import br.com.ifs.projetoWeb.repository.UsuarioRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DetalheUsuarioServiceImpl implements UserDetailsService {

    private final UsuarioRepository repository;

    public DetalheUsuarioServiceImpl(UsuarioRepository repository) {
        this.repository = repository;
    }
    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<Usuario> usuario = repository.findByLogin(login);
        if (usuario.isEmpty()) {
            throw new UsernameNotFoundException("Usuário [" + login + "] não encontrado");
        }
        return usuario.get();
    }
}