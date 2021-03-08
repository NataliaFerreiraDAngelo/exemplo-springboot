package br.com.raiadrogasil.meuprimeiroprojetospringboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BemVindoController {

    @GetMapping("/")
    public String obterMensagem(){
        return "Meu primeiro Projeto SpringBoot";
    }

    @GetMapping("/hello")
    public String hello(){
        return "Olá!";
    }

    @PostMapping("")
    public String salvar(){
        //TODO implementar registro salvar
        return "Registro salvo com sucesso";
    }
}
