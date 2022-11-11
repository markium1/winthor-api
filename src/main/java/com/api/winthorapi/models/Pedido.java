package com.api.winthorapi.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "PCPEDC")
@Data
public class Pedido {

    @Id
    @Column(name = "NUMPED")
    private Integer numPed;

    @Column(name = "CODCLI")
    private Long codCli;

    @Column(name = "DATA")
    private LocalDate dataPedido;

    @Column(name = "DTENTREGA")
    private LocalDate dataEntrega;

    @Column(name = "VLTOTAL")
    private BigDecimal VLTOTAL;

    @Column(name = "CODFILIAL")
    private String codFilial;

    @Column(name = "NUMITENS")
    private int numItens;

    @Column(name = "POSICAO")
    private String posicao;
}
