package br.com.ifs.projetoWeb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tor_torneio")
public class Torneio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name = "tor_nr_id")
    private int id;

    @OneToMany(mappedBy = "torneio")
    private List<Categoria> categorias;

    @Column(name = "tor_tx_nome", nullable = false, length = 100)
    private String nome;

    }
