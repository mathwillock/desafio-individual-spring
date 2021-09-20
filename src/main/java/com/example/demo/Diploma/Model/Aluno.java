package com.example.demo.Diploma.Model;

import jdk.jfr.StackTrace;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Aluno {

    private String nome;
    private String endereco;
    private int idade;
    private List<Disciplina> disciplinas;


    public Aluno(String nome, String endereco, int idade, List<Disciplina> disciplinas) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
        this.disciplinas = disciplinas;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", idade=" + idade +
                '}';
    }
}
