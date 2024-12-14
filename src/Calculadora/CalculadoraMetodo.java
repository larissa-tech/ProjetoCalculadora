package Calculadora;


public class CalculadoraMetodo {

    // Método para soma
    public double somar(double a, double b) {
        return a + b;
    }

    // Método para subtração
    public double subtrair(double a, double b) {
        return a - b;
    }

    // Método para multiplicação
    public double multiplicar(double a, double b) {
        return a * b;
    }

    // Método para divisão
    public double dividir(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}