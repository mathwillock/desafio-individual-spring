package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class ControllerPing {

    @GetMapping("/")
    public String home() {
        return "Hello World!";
    }

//    @GetMapping("/ping")
//     public String ping() {
//         return "pong®";
//     }

     @GetMapping("/nameFull")
    public String nameFull(String name) {

        if (name.equalsIgnoreCase("Itachi")) {
            return "Uticha Itachi";
        } else {
            return "Chakra não reconhecido";
        }

    }

    @GetMapping("/rankNinja")
    public String rankNinja(String name, String rank) {

        if (name.equalsIgnoreCase("Itachi") && rank.equalsIgnoreCase("Kage")) {
            return "Itachi é nível Hokage";
        } else {
            return "Vai estudar Naruto!";
        }



    }


}
