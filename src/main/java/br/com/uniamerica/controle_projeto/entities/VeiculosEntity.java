package br.com.uniamerica.controle_projeto.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity(name = "veiculos")
public class VeiculosEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "marca")
    @NotNull @NotBlank @NotEmpty
    private String marca;

    private String modelo;

    @Column(columnDefinition = "int default 2000")
    @Min(18)
    private int ano;



    @ManyToOne
    @JoinColumn(name = "proprietario_id")
    @JsonIgnoreProperties("veiculos")
    private ProprietarioEntity proprietarioEntity;

    @ManyToMany
    @JoinTable(
            name = "veiculo_motorista",
            joinColumns = @JoinColumn(name = "veiculos_id"),
            inverseJoinColumns = @JoinColumn(name = "motorista_id")
    )
    @JsonIgnoreProperties("veiculos")
    private List<MotoristaEntity> motoristas;

}
