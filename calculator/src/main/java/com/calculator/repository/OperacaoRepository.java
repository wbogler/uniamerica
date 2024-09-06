package com.calculator.repository;

import com.calculator.entity.OperacaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperacaoRepository extends JpaRepository<OperacaoEntity,Long> {
}
