package br.com.uniamerica.controle_projeto.repositories;

import br.com.uniamerica.controle_projeto.entities.VeiculosEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<VeiculosEntity,Long> {

    List<VeiculosEntity> findByMarca(String marca);

    @Query(value = "select count(id) from veiculos where marca=?", nativeQuery = true)
    int totalMarcas(String marca);

}
