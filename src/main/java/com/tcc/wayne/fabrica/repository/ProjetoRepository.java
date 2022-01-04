package com.tcc.wayne.fabrica.repository;

import com.tcc.wayne.fabrica.domain.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {
}
