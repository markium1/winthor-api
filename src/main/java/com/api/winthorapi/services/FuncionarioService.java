package com.api.winthorapi.services;

import com.api.winthorapi.models.Funcionario;
import com.api.winthorapi.repositorys.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioService {

    @Autowired
    FuncionarioRepository funcionarioRepository;


    public List<Funcionario> findAll() {
        return funcionarioRepository.findAll();
    }
}
