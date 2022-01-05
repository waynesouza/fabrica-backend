package com.tcc.wayne.fabrica.web.rest;

import com.tcc.wayne.fabrica.service.EquipeService;
import com.tcc.wayne.fabrica.service.dto.EquipeDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/equipe")
@Slf4j
@RequiredArgsConstructor
public class EquipeResource {

    private final EquipeService equipeService;

    @GetMapping("/jpql")
    public ResponseEntity<List<EquipeDTO>> listarTodosJPQL() {
        log.debug("Requisição para buscar as equipes");
        return new ResponseEntity<>(equipeService.listarTodosJPQL(), HttpStatus.OK);
    }

    @GetMapping("/criteria")
    public ResponseEntity<List<EquipeDTO>> listarTodosCriteria() {
        log.debug("Requisição para buscar as equipes");
        return new ResponseEntity<>(equipeService.listarTodosCriteria(), HttpStatus.OK);
    }

}
