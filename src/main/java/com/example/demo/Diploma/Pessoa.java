package com.example.demo.Diploma;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
