package com.tcc.wayne.fabrica.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "TB_PROJETO")
@Entity
@Getter
@Setter
public class Projeto implements Serializable {

    @Id
    @Column(name = "ID_PROJETO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_PROJETO_ID_PROJETO")
    @SequenceGenerator(name = "SQ_PROJETO_ID_PROJETO", sequenceName = "SQ_PROJETO_ID_PROJETO", allocationSize = 1)
    private Long id;

    @Column(name = "NO_PROJETO")
    private String nome;

    @Column(name = "DT_INICIAL")
    private LocalDate dataInicial;

    @Column(name = "DT_FINAL")
    private LocalDate dataFinal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EQUIPE", nullable = false)
    private Equipe equipe;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CLIENTE", nullable = false)
    private Cliente cliente;
    
}
