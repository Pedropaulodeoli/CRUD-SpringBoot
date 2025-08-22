package com.escola.escolaOnline.controller;

import com.escola.escolaOnline.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ExcluirAluno {

    @Autowired
    UserService userService;

    @GetMapping("/excluirAluno")
    public String excluirAluno () {

        return "excluir";
    }
}
