package com.tcc.wayne.fabrica.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Table(name = "TB_EQUIPE")
@Entity
@Getter
@Setter
public class Equipe implements Serializable {

    @Id
    @Column(name = "ID_EQUIPE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_EQUIPE_ID_EQUIPE")
    @SequenceGenerator(name = "SQ_EQUIPE_ID_EQUIPE", sequenceName = "SQ_EQUIPE_ID_EQUIPE", allocationSize = 1)
    private Long id;

    @Column(name = "NO_EQUIPE")
    private String nome;

    @Column(name = "DT_CRIACAO")
    private LocalDate dataCriacao;
    
}
