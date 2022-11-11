package com.api.winthorapi.models;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pcempr")
@Data
public class Funcionario {

    @Id
    @Column(name = "matricula")
    private Long matricula;

    @Column(name = "nome")
    private String nome;
}
