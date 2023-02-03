package br.com.ifs.projetoWeb.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ins_inscricao")
public class Inscricao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ins_nr_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "cat_nr_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "usu_nr_id1")
    private Usuario usuario1;

    @ManyToOne
    @JoinColumn(name = "usu_nr_id2")
    private Usuario usuario2;


    public Inscricao( Categoria categoria, Usuario usuario1, Usuario usuario2) {
        this.categoria = categoria;
        this.usuario1 = usuario1;
        this.usuario2 = usuario2;
    }
}
