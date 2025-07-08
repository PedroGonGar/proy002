package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void testSumar() {
        App app = new App();
        int resultado = app.sumar(2, 3);
        assertTrue(resultado == 5, "La suma de 2 y 3 debería ser 5");
    }

    public void testRestar() {
        App app = new App();
        int resultado = app.restar(4, 3);
        assertTrue(resultado == 1, "La resta de 4 y 3 debería ser 1");
    }

    public void testMultiplicar() {
        App app = new App();
        int resultado = app.multiplicar(2, 3);
        assertTrue(resultado == 6, "La multiplicación de 2 y 3 debería ser 6");
    }

    public void testDividir() {
        App app = new App();
        int resultado = app.dividir(6, 3);
        assertTrue(resultado == 2, "La división de 6 entre 3 debería ser 2");
    }
}
