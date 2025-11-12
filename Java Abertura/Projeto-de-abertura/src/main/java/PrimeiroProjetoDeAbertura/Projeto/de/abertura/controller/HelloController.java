package PrimeiroProjetoDeAbertura.Projeto.de.abertura.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String ola() {
        return "Agora nos começamos a usar o spring boot de verdade  kkk ";
    }
}
