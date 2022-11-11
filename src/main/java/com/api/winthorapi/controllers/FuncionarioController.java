package com.api.winthorapi.controllers;

import com.api.winthorapi.models.Funcionario;
import com.api.winthorapi.services.FuncionarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/users")
public class FuncionarioController {

    final FuncionarioService funcionarioService;


    public FuncionarioController(FuncionarioService funcionarioService) {
        this.funcionarioService = funcionarioService;
    }

    @GetMapping("")
    public ResponseEntity<List<Funcionario>> getAllFuncionarios(){
        return ResponseEntity.status(HttpStatus.OK).body(funcionarioService.findAll());
    }
}
