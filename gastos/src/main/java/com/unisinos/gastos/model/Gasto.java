package com.unisinos.gastos.model;

import org.apache.logging.log4j.util.Strings;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Gasto {

    private Long id;

    private String descricao;

    private BigDecimal valor;

    private LocalDate data;

    private Categoria categoria;


    public boolean possuiCategoria() {
        return categoria != null;
    }

    public boolean possuiDescricao() {
        return Strings.isNotEmpty(descricao);
    }

    public boolean valorValido() {
        return valor.compareTo(BigDecimal.ZERO) > 0;
    }

    public Gasto(BigDecimal valor) {
        this.valor = valor;
    }

    public Gasto(String descricao) {
        this.descricao = descricao;
    }

    public Gasto() {}

}