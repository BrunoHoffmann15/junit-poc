package com.unisinos.gastos.unit.model;

import com.unisinos.gastos.model.Gasto;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class GastoTests {

    @BeforeEach
    public void setup() {
        System.out.println("Insere dados para cenários.");
    }

    @BeforeAll
    public static void setupAll() {
        System.out.println("Inícia conexão do banco de dados.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Finaliza conexão do banco de dados.");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Remove dados das tabelas.");
    }

    @ParameterizedTest(name = "Dado o valor válido {0}, deve ser retornado verdadeiro.")
    @ValueSource(doubles = { 0.1, 100.00, 400000.00 })
    public void valorValido_ValorValido_DeveRetornarTrue(double valor) {
        System.out.println("Executando Cénario 1.");

        BigDecimal valorBigDecimal = BigDecimal.valueOf(valor);
        Gasto gasto = new Gasto(valorBigDecimal);

        assertTrue(gasto.valorValido());
    }

    @ParameterizedTest(name = "Dado o valor inválido {0}, deve ser retornado falso.")
    @ValueSource(doubles = { 0, -1.0, -140000.0 })
    public void valorValido_ValorInvalido_DeveRetornarFalse(double valor) {
        System.out.println("Executando Cénario 2.");

        BigDecimal valorBigDecimal = BigDecimal.valueOf(valor);
        Gasto gasto = new Gasto(valorBigDecimal);

        assertFalse(gasto.valorValido());
    }

}

