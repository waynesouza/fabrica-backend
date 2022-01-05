package com.tcc.wayne.fabrica.repository;

import com.tcc.wayne.fabrica.domain.Equipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EquipeRepository extends JpaRepository<Equipe, Long> {

    @Query("SELECT e FROM Equipe e WHERE e.dataCriacao <= :dataCriacao")
    List<Equipe> listarPorDataCriacaoJPQL(@Param("dataCriacao")LocalDate dataCriacao);
}
