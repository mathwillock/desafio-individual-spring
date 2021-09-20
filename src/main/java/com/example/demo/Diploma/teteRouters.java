package com.example.demo.Diploma;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@Controller
@RestController
public class teteRouters {


    HashMap<String, Integer> testando = new HashMap<>();


//// Test server
//    @GetMapping("/ping")
//    public String ping() {
//        return "pong";
//    }

    @PostMapping("/teste")
    public void testandoPost(@RequestBody Pessoa pessoa) {

        testando.put(pessoa.getNome(), pessoa.getIdade());

    }

    @GetMapping("/mostrarTeste")
    public HashMap<String, Integer> mostrarPost() {
        return testando;
    }


}
