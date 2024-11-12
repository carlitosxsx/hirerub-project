package br.hirehub.hh.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class ServicoPrestado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDateTime dataServico;
    @ManyToOne
    private StatusServico statusServico;
    @ManyToOne
    private Contratante contratante;
    @ManyToOne
    private Fornecedor fornecedor;

}