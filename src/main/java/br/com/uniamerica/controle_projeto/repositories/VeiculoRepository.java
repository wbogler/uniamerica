package br.com.uniamerica.controle_projeto.repositories;

import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculosEntity,Long> {

}
