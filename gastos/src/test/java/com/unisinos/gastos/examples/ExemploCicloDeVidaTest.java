package com.unisinos.gastos.examples;

import org.junit.jupiter.api.*;

class ExemploCicloDeVidaTest {

    @BeforeAll
    static void setupAll() {
        System.out.println("\n@BeforeAll - Inicializa conexão com banco de dados");
    }

    @BeforeEach
    void setupEach() {
        System.out.println("\t@Before Each - Insere dados na base de dados");
    }

    @Test
    void cenario1() {
        System.out.println("\t\tExecuta cenário 1");
    }

    @Test
    void cenario2() {
        System.out.println("\t\tExecuta cenário 2");
    }

    @AfterEach
    void cleanUp() {
        System.out.println("\t@AfterEach - Faz limpeza de dados na base.");
    }

    // 8. Executa no FIM de tudo (1 vez)
    @AfterAll
    static void dispose() {
        System.out.println("@AfterAll - Finaliza conexão com a base de dados");
    }
}