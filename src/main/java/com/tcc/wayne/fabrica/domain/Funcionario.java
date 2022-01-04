package com.tcc.wayne.fabrica.domain;

import com.tcc.wayne.fabrica.domain.enumeration.EnumCargo;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "TB_FUNCIONARIO")
@Entity
@Getter
@Setter
public class Funcionario implements Serializable {

    @Id
    @Column(name = "ID_FUNCIONARIO")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_FUNCIONARIO_ID_FUNCIONARIO")
    @SequenceGenerator(name = "SQ_FUNCIONARIO_ID_FUNCIONARIO", sequenceName = "SQ_FUNCIONARIO_ID_FUNCIONARIO", allocationSize = 1)
    private Long id;

    @Column(name = "NO_FUNCIONARIO")
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "TP_CARGO")
    private EnumCargo cargo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EQUIPE", nullable = false)
    private Equipe equipe;

}
