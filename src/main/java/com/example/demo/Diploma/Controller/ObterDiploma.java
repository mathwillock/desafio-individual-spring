package com.example.demo.Diploma.Controller;

import com.example.demo.Diploma.Model.Aluno;
import com.example.demo.Diploma.Model.Disciplina;
import com.example.demo.Diploma.Services.AlunoServices;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@Controller
@RestController
public class ObterDiploma {

     AlunoServices alunoServices = new AlunoServices();

    @PostMapping("/cadastrarAlunos")
    public void cadastrar(@RequestBody Aluno newData) {

         alunoServices.cadastrarAluno(newData);

    }

    @GetMapping("/mostrarAlunos")
    public List<Aluno> alunos() {
     return alunoServices.mostrarAlunos();
    }



}
