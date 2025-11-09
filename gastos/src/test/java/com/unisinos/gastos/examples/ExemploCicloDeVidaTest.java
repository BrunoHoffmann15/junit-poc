package com.unisinos.gastos.examples;

import org.junit.jupiter.api.*;

class ExemploCicloDeVidaTest {

    @BeforeAll
    static void setupGlobal() {
        System.out.println("\n@BeforeAll - Inicializa conexão com banco de dados");
    }

    @BeforeEach
    void setupCadaTeste() {
        System.out.println("\t@Before Each - Insere dados na base de dados");
    }

    @Test
    void testeUm() {
        System.out.println("\t\tExecuta cenário 1");
    }

    @Test
    void testeDois() {
        System.out.println("\t\tExecuta cenário 2");
    }

    @AfterEach
    void limparCadaTeste2() {
        System.out.println("\t@AfterEach - Faz limpeza de dados na base.");
    }

    // 8. Executa no FIM de tudo (1 vez)
    @AfterAll
    static void cleanupGlobal() {
        System.out.println("@AfterAll - Finaliza conexão com a base de dados");
    }
}