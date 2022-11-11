package com.api.winthorapi.controllers;

import com.api.winthorapi.models.Funcionario;
import com.api.winthorapi.models.Pedido;
import com.api.winthorapi.services.FuncionarioService;
import com.api.winthorapi.services.PedidoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/pedidos")
public class PedidoController {

    final PedidoService pedidoService;


    public PedidoController(PedidoService pedidoService) {
        this.pedidoService = pedidoService;
    }

    @GetMapping("")
    public ResponseEntity<List<Pedido>> getAllPedidos(){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getOnePedido(@PathVariable(value = "id") Integer id){
        Optional<Pedido> pedidoOptional = pedidoService.findById(id);

        if(!pedidoOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Not Found");
        }

        return ResponseEntity.status(HttpStatus.OK).body(pedidoOptional.get());
    }
}
