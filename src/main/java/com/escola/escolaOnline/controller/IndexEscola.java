package com.escola.escolaOnline.controller;

import com.escola.escolaOnline.Service.UserService;
import com.escola.escolaOnline.models.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;


@Controller
public class IndexEscola {

    @GetMapping("/")
    public String index () {

        return "Index";
    }
}
