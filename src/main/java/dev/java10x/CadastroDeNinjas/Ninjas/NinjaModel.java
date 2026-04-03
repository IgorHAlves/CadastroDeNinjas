package dev.java10x.CadastroDeNinjas.Ninjas;

import dev.java10x.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

@Entity // Transofmra uma classe em uma entidade do banco de dados
@Table(name = "tb_cadastro")
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

    public NinjaModel() {
    }
    public NinjaModel(String nome, String email, Integer idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
