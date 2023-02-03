package br.com.ifs.projetoWeb.dto;

import br.com.ifs.projetoWeb.model.Categoria;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoriaDto implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;

    private String nome;


    public CategoriaDto(Categoria categoria) {
        this.id = categoria.getId();
        this.nome = categoria.getNome();
    }
}

