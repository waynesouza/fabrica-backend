package com.tcc.wayne.fabrica.service;

import com.tcc.wayne.fabrica.domain.Equipe;
import com.tcc.wayne.fabrica.repository.EquipeRepository;
import com.tcc.wayne.fabrica.service.dto.EquipeDTO;
import com.tcc.wayne.fabrica.service.mapper.EquipeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class EquipeService {

    @PersistenceContext
    private final EntityManager entityManager;

    private final EquipeRepository equipeRepository;
    private final EquipeMapper equipeMapper;

    public List<EquipeDTO> listarTodosJPQL() {
        return equipeMapper.toDto(equipeRepository.findAll());
    }

    public List<EquipeDTO> listarTodosCriteria() {
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();

        CriteriaQuery<Equipe> criteriaQuery = criteriaBuilder.createQuery(Equipe.class);
        Root<Equipe> root = criteriaQuery.from(Equipe.class);
        criteriaQuery.select(root);

        TypedQuery<Equipe> typedQuery = entityManager.createQuery(criteriaQuery);
        List<EquipeDTO> equipeDTO = equipeMapper.toDto(typedQuery.getResultList());

        return equipeDTO;
    }
}
