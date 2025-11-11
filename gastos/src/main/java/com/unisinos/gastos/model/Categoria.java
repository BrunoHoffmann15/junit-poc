package com.unisinos.gastos.model;


import org.apache.logging.log4j.util.Strings;

public class Categoria {

    private Long id;

    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public boolean possuiNomeValido() {
        return Strings.isNotBlank(this.nome)
                && this.nome.length() <= 20;
    }
}