package br.com.ifs.projetoWeb.service;



import br.com.ifs.projetoWeb.model.Categoria;
import br.com.ifs.projetoWeb.model.Inscricao;
import br.com.ifs.projetoWeb.model.Usuario;
import br.com.ifs.projetoWeb.repository.CategoriaRepository;
import br.com.ifs.projetoWeb.repository.InscricaoRepository;
import br.com.ifs.projetoWeb.repository.UsuarioRepository;
import com.auth0.jwt.JWT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class InscricoesService {

    @Autowired
    private InscricaoRepository inscricaoRepository;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Inscricao criar(int categoriaid, String token, Usuario usuario) {
        Categoria categoria = categoriaRepository.findById(categoriaid).get();

        var js = JWT.decode(token.replace("Bearer ", "")).getSubject();

        Usuario usuario1 = usuarioRepository.findByLogin(js).get();
        Inscricao inscricao = new Inscricao(categoria, usuario1, usuario);
        return inscricaoRepository.save(inscricao);
    }

}