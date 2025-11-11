package com.unisinos.gastos.unit.model;


import com.unisinos.gastos.model.Categoria;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CategoriaTests {

    @DisplayName("Cenário 1 - Criar categoria com nome inválido")
    @ParameterizedTest(name ="Dado o valor {0} inválido, ao chamar o método possuiNomeValido, o sistema deve retornar false.")
    @ValueSource(strings = {"", " ", "123456789012345678901"})
    public void possuiNomeValido_NomeInvalido_DeveRetornarFalso(String nomeInvalido) {
        Categoria categoria = new Categoria(nomeInvalido);
        assertFalse(categoria.possuiNomeValido());
    }

    @DisplayName("Cenário 2 - Criar categoria com nome válido")
    @ParameterizedTest(name ="Dado o valor {0} válido, ao chamar o método possuiNomeValido, o sistema deve retornar true.")
    @ValueSource(strings = {"12345678901234567890", "G"})
    public void possuiNomeValido_NomeValido_DeveRetornarVerdadeiro(String nomeValido) {
        Categoria categoria = new Categoria(nomeValido);
        assertTrue(categoria.possuiNomeValido());
    }

}
