package com.api.winthorapi.repositorys;

import com.api.winthorapi.models.Funcionario;
import com.api.winthorapi.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}