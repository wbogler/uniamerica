package br.com.uniamerica.controle_projeto.entities;

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
@Entity(name = "veiculos")
public class VeiculosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "marca")
    private String marca;
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "proprietario_id")
    private ProprietarioEntity proprietarioEntity;

    @ManyToMany
    @JoinTable(
            name = "veiculo_motorista",
            joinColumns = @JoinColumn(name = "veiculos_id"),
            inverseJoinColumns = @JoinColumn(name = "motorista_id")
    )
    private List<MotoristaEntity> motoristas;

}
