package com.tcc.wayne.fabrica.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Table(name = "TB_CLIENTE")
@Entity
@Getter
@Setter
public class Cliente implements Serializable {

    @Id
    @Column(name = "ID_CLIENTE")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_CLIENTE_ID_CLIENTE")
    @SequenceGenerator(name = "SQ_CLIENTE_ID_CLIENTE", sequenceName = "SQ_CLIENTE_ID_CLIENTE", allocationSize = 1)
    private Long id;

    @Column(name = "NO_CLIENTE")
    private String nome;
    
}
