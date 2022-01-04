package com.tcc.wayne.fabrica.service.dto;

import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
public class EquipeDTO implements Serializable {

    @NotNull
    private Long id;

    @NotNull
    private String nome;

    @NotNull
    private LocalDate dataCriacao;

}
