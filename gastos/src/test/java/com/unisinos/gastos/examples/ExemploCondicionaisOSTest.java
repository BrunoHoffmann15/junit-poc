package com.unisinos.gastos.examples;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExemploCondicionaisOSTest {

    @Test
    @DisabledOnOs(OS.LINUX)
    @DisplayName("Não executa no Linux")
    public void executar_SistemaLinux_NaoDeveExecutar() {
        System.out.println("Executando no Linux");
        assertTrue(true);
    }

    @Test
    @DisabledOnOs(OS.WINDOWS)
    @DisplayName("Não executa no Windows")
    public void executar_SistemaWindows_NaoDeveExecutar() {
        System.out.println("Executando no Windows");
        assertTrue(true);
    }

    @Test
    @DisabledOnOs(OS.MAC)
    @DisplayName("Não executa no MacOS")
    public void executar_SistemaMac_NaoDeveExecutar() {
        System.out.println("Executando no MacOS");
        assertTrue(true);
    }
}
