package br.hirehub.hh.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private double nota;
    @Column(length = 4000)
    private String comentario;
    private LocalDateTime dataAvaliacao;
    @ManyToOne
    private Contratante quemAvalia;

}
