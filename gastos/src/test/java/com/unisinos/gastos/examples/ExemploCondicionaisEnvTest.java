package com.unisinos.gastos.examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class ExemploCondicionaisEnvTest {
    @Test
    @EnabledIfEnvironmentVariable(named = "env", matches = "DEV")
    @DisplayName("Executa apenas em DEV")
    void executar_AmbienteDEV_DeveExecutar() {
        System.out.println("Executando em DEV");
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "env", matches = "QA")
    @DisplayName("Executa apenas em QA")
    void executar_AmbienteQA_DeveExecutar() {
        System.out.println("Executando em QA");
    }
}
