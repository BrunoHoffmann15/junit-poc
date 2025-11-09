package com.unisinos.gastos.examples;

import com.unisinos.gastos.model.Gasto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ExemploTagEDisplayName {

    @Test
    @DisplayName("Dado uma descrição válida, quando chamar o método possuiDescrição, então deve ser retornado verdadeiro.")
    @Tag("descricao")
    public void possuiDescricao_DescricaoValida_DeveRetornarVerdadeiro() {

    }

    @Test
    @DisplayName("Dado uma descrição inválida, quando chamar o método possuiDescrição, então deve ser retornado falso.")
    @Tag("descricao")
    public void possuiDescricao_DescricaoInvalida_DeveRetornarFalso() {

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
