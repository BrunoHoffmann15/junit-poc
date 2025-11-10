package com.unisinos.gastos.examples;

import com.unisinos.gastos.model.Gasto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExemploTagEDisplayName {

    @Test
    @DisplayName("Dado uma descrição válida, quando chamar o método possuiDescrição, então deve ser retornado verdadeiro.")
    @Tag("descricao")
    public void possuiDescricao_DescricaoValida_DeveRetornarVerdadeiro() {
        String descricao = "Cinema 20/01";
        Gasto gasto = new Gasto(descricao);

        assertTrue(gasto.possuiDescricao());
    }

    @DisplayName("Dado uma descrição inválida, quando chamar o método possuiDescrição, então deve ser retornado falso.")
    @ParameterizedTest(name = "Dado o valor inválido {0}, deve ser retornado falso.")
    @ValueSource(strings = {""})
    @Tag("descricao")
    public void possuiDescricao_DescricaoInvalida_DeveRetornarFalso(String descricaoInvalida) {
        Gasto gasto = new Gasto(descricaoInvalida);
        assertFalse(gasto.possuiDescricao());
    }


    @DisplayName("Dado um valor válido, quando chamar o método valorValido, então deve ser retornado verdadeiro.")
    @ParameterizedTest(name = "Dado o valor válido {0}, deve ser retornado verdadeiro.")
    @Tag("valor")
    @ValueSource(doubles = { 0.1, 100.00, 400000.00 })
    public void valorValido_ValorValido_DeveRetornarTrue(double valor) {
        BigDecimal valorBigDecimal = BigDecimal.valueOf(valor);
        Gasto gasto = new Gasto(valorBigDecimal);

        assertTrue(gasto.valorValido());
    }

}
