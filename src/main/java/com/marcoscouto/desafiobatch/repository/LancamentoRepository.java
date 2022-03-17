package com.marcoscouto.desafiobatch.repository;

import com.marcoscouto.desafiobatch.data.LancamentoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface LancamentoRepository extends CrudRepository<LancamentoEntity, Integer> {
}
