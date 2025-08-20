package com.escola.escolaOnline.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Controller;

@Entity
@Table(name = "usuarios_Escola")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @Column(nullable = false)
    private String serie;

    @Column(nullable = false)
    private int idade;

    @Column(nullable = false)
    private int letivo;

    @Column(nullable = false, length = 150, unique = true)
    private String email;

    //Getters
    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getSerie() {
        return serie;
    }

    public int getIdade() {
        return idade;
    }

    public int getLetivo() {
        return letivo;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setId(long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setLetivo(int letivo) {
        this.letivo = letivo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", serie='" + serie + '\'' +
                ", idade=" + idade +
                ", letivo=" + letivo +
                ", email='" + email + '\'' +
                '}';
    }

}
