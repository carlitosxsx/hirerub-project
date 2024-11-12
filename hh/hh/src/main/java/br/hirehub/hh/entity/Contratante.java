package br.hirehub.hh.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Contratante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomeLogin;
    private String senha;
    @OneToOne
    private Usuario usuarioDono;

}