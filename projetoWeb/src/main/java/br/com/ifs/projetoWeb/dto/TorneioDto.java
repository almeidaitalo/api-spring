package br.com.ifs.projetoWeb.dto;

import br.com.ifs.projetoWeb.model.Torneio;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TorneioDto implements Serializable {

    private static final long serialVersionUID = 1L;
    private int id;

    private String nome;


    public TorneioDto(Torneio obj) {
        this.id = obj.getId();
        this.nome = obj.getNome();
    }
}
