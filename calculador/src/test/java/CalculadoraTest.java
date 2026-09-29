import org.example.calculadora.Calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    private Calculadora calculadora;

    @BeforeEach
    void setUp() {
        calculadora = new Calculadora();
    }

    @Test
    void somar() {
        int resultado = calculadora.soma(1, 2);
        Assertions.assertEquals(5, resultado);
    }
    @Test
    void subtrair() {
        int resultado = calculadora.sub(2, 1);
        Assertions.assertEquals(1, resultado);
    }
    @Test
    void multiplicar() {
        int resultado = calculadora.mult(4, 7);
        Assertions.assertEquals(28, resultado);
    }
    @Test
    void divisao() {
        double resultado = calculadora.divisao(12.0, 3.0);
        Assertions.assertEquals(4.0, resultado, 0.0001);
    }
    @Test
    void divisaoPorZero() {
        ArithmeticException erro = Assertions.assertThrows(
                ArithmeticException.class,
                () -> calculadora.divisao(12.0, 0.0)
        );
        Assertions.assertEquals(
                "Divisão por zero não permitida",
                erro.getMessage()
        );

    }
}