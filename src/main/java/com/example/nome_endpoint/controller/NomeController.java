package com.example.nome_endpoint.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomeController {

    @GetMapping("/nome")
    public String getNome() {
        return "Samuel Dornelas De Oliveira";
    }
}
