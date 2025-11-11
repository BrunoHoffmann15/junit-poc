package com.unisinos.gastos.examples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class ExemploAssumptionTest {

    @Test
    public void executar_AmbienteDev_NaoDeveExecutar() {
        String ambiente = System.getenv("env");

        assumeFalse(ambiente.equals("dev"),
                () -> "Teste deve ser executado apenas fora do ambiente de DEV");

        System.out.println("Executa validações fora de desenvolvimento");
    }

    @Test
    public void executar_AmbienteDev_DeveExecutar() {
        String ambiente = System.getenv("env");

        assumeTrue(ambiente.equals("dev"),
                () -> "Teste deve ser executado apenas fora do ambiente de DEV");

        System.out.println("Executa validações fora de desenvolvimento");
    }
}
