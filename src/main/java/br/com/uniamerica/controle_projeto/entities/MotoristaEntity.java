package br.com.uniamerica.controle_projeto.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
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
@Entity(name = "motorista")
public class MotoristaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;
    private String cnh;

    @Column(nullable = true)
    @Pattern(regexp = "^[^@]+@[^@]+\\.[^@]+$")
    private String email;

    @ManyToMany(mappedBy = "motoristas")
    @JsonIgnoreProperties("motoristas")
    private List<VeiculosEntity> veiculos;
}
