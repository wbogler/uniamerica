package br.com.uniamerica.controle_projeto.repositories;

import br.com.uniamerica.controle_projeto.entities.MotoristaEntity;
import br.com.uniamerica.controle_projeto.entities.ProprietarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotoristaRepository extends JpaRepository<MotoristaEntity,Long> {

}
