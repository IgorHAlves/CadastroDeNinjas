package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity // Transofmra uma classe em uma entidade do banco de dados
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
// JPA = Java Persistence APÍ
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private Integer idade;

    //@ManyToOne indica que o ninja vai ter apenas uma missão
    @ManyToOne
    @JoinColumn(name="missoes_id") // Foreing Key
    private MissoesModel missoesModel;

