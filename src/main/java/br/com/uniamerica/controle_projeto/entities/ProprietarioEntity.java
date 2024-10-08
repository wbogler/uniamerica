package br.com.uniamerica.controle_projeto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity(name = "proprietario")
public class ProprietarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String cnh;

    @OneToMany(mappedBy = "proprietarioEntity")
    @JsonIgnoreProperties("proprietarioEntity")
    private List<VeiculosEntity> veiculos;
}
