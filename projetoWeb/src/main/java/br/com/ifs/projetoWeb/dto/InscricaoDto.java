package br.com.ifs.projetoWeb.dto;


import br.com.ifs.projetoWeb.model.Categoria;
import br.com.ifs.projetoWeb.model.Usuario;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class InscricaoDto {

    private int id;

    private Categoria categoria;

    private Usuario usuario1;

    private Usuario usuario2;


}
