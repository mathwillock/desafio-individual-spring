package com.example.demo.Diploma.Services;

import com.example.demo.Diploma.Model.Aluno;
import com.example.demo.Diploma.Model.Disciplina;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AlunoServices {

    List<Aluno> listaAlunos = new ArrayList<>();

    public void cadastrarAluno(Aluno newData ) {

        listaAlunos.add(newData);

    }

    public List<Aluno> mostrarAlunos() {

        return listaAlunos;



    }



}
