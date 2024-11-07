package br.hirehub.hh.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Fornecedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeLogin;
    private String senha;
    @OneToMany
    private List<TipoServico> tiposServicos;
    @OneToMany
    private List<Avaliacao> avaliacoes;
    @OneToOne
    private Usuario usuarioDono;

}
