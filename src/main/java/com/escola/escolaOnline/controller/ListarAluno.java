package com.escola.escolaOnline.controller;

import com.escola.escolaOnline.Service.UserService;
import com.escola.escolaOnline.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class ListarAluno {

    @Autowired
    private UserService userService;

    @GetMapping("/listarAluno")
    public String listarAluno (Model model) {

        model.addAttribute("alunos", userService.listarAlunos());
        return "listarAluno";
    }

    @PostMapping("/listarAluno")
    public String pesquisarAluno (@RequestParam("search") String search, Model model) {

        if (search == null || search.isBlank()) {
            return "redirect:/listarAluno";
        }

        List<UserEntity> resultado = userService.buscarPorNome(search);
        model.addAttribute("alunos", resultado);

        if (resultado.isEmpty()) {
            model.addAttribute("mensagem", "Nem um aluno encontrado para: " + search);
        }

        return "listarAluno";
    }
}
