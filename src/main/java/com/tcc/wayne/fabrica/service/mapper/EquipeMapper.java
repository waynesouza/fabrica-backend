package com.tcc.wayne.fabrica.service.mapper;

import com.tcc.wayne.fabrica.domain.Equipe;
import com.tcc.wayne.fabrica.service.dto.EquipeDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EquipeMapper {

    EquipeDTO toDto(Equipe equipe);

    Equipe toEntity(EquipeDTO equipeDTO);

    List<EquipeDTO> toDto(List<Equipe> equipe);
}
