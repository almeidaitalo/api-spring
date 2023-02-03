package br.com.ifs.projetoWeb.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usu_usuario")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "usu_nr_id")
    private int id;

    @Column(name = "usu_tx_nome", nullable = false, length = 50)
    private String nome;

    @Column(name = "usu_tx_login", nullable = false, length = 20)
    private String login;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @Column(name = "usu_tx_senha", nullable = false, columnDefinition = "text")
    private String password;

    @Column(name = "usu_dt_cadastro", nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDateTime dataCadastro;

    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return new ArrayList<>();
    }
    @JsonIgnore
    @Override
    public String getUsername() {
        return login;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }
    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
