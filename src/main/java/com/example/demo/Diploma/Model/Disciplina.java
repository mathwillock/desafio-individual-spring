package com.example.demo.Diploma.Model;


import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

@Getter
@Setter
public class Disciplina {

    private String nome;
    private int nota;


    public Disciplina(String nome, int nota) {
        this.nome = nome;
        this.nota = nota;

    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "nome='" + nome + '\'' +
                ", nota=" + nota +
                '}';
    }
}
