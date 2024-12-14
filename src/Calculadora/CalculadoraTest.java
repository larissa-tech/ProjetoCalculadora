package Calculadora;

//import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    CalculadoraMetodo calculadora = new CalculadoraMetodo();

    @Test
    void testSomar() {
        assertEquals(5, calculadora.somar(2, 3));
        assertEquals(0, calculadora.somar(-2, 2));
    }

    @Test
    void testSubtrair() {
        assertEquals(1, calculadora.subtrair(3, 2));
        assertEquals(-4, calculadora.subtrair(-2, 2));
    }

    @Test
    void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3));
        assertEquals(0, calculadora.multiplicar(0, 5));
    }

    @Test
    void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3));
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(1, 0);
        });
        assertEquals("Divisão por zero não é permitida.", exception.getMessage());
    }
}