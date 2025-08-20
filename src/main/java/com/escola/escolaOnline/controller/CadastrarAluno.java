package com.escola.escolaOnline.controller;

import com.escola.escolaOnline.Repository.UserRepository;
import com.escola.escolaOnline.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CadastrarAluno {

    @Autowired
    private UserService userService;

    @GetMapping("/cadastrar")
    public String cadastroAluno () {

        return "Cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrarAluno (@RequestParam String nome,
                                @RequestParam String serie,
                                @RequestParam int idade,
                                @RequestParam int ano,
                                @RequestParam String email) {

        if (userService.adicionarAluno(nome, serie, idade, ano, email)) {
            return "redirect:/cadastrar";
        }
        else {
            return "erro";
        }

    }
}
