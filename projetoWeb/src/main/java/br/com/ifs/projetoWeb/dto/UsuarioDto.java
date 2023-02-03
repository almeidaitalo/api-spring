package br.com.ifs.projetoWeb.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {

    private int id;

    private String nome;

    private String login;

    private String password;
}
