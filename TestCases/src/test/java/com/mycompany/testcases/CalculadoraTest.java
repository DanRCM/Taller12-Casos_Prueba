package com.mycompany.testcases;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author DanRCM
 */
public class CalculadoraTest {
    static Calculadora calculadora;
    
    public CalculadoraTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        calculadora = new Calculadora();
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("Todas las pruebas pasadas");
    }
    @Test
    public void testSuma() {
        assertEquals("TCS01", -8.0, calculadora.suma(-3.0, -5.0), 0.001); // Funciona correctamente con números negativos.
        assertEquals("TCS02", 8.0, calculadora.suma(3.0, 5.0), 0.001); // Funciona correctamente con números positivos.
        // TCS03 no se puede realizar ya que A y B no son valores válidos para el método.
        assertEquals("TCS04", 1.0, calculadora.suma(0.5, 0.5), 0.001); // Funciona correctamente con flotantes.
    }

    @Test
    public void testResta() {
        assertEquals("TCS01", 7.0, calculadora.resta(6.0, -1.0), 0.001); // Asumimos que la variable b, si es negativa, se multiplicará con el signo negativo y se convertirá en +1.
        assertEquals("TCS02", 2.0, calculadora.resta(5.0, 3.0), 0.001); // Funciona correctamente con números positivos.
        // TCS03 no se puede realizar ya que A y B no son valores válidos para el método.
        assertEquals("TCS04", 0.0, calculadora.resta(0.5, 0.5), 0.001); // Funciona correctamente con flotantes.
        assertEquals("TCS05", -8.0, calculadora.resta(-5.0, 3.0), 0.001); // Funciona correctamente restando un negativo como a y un positivo como b.
    }

    @Test
    public void testMultiplicacion() {
        assertEquals("TCS01", 0.0, calculadora.multiplicacion(0.0, -1.0), 0.001); // Imprime -0.0 al imprimir el 0 con un número negativo.
        assertEquals("TCS02", 15.0, calculadora.multiplicacion(5.0, 3.0), 0.001); // Funciona correctamente con números positivos.
        // TCS03 no se puede realizar ya que A y B no son valores válidos para el método.
        assertEquals("TCS04", 0.15, calculadora.multiplicacion(0.5, 0.3), 0.001); // Funciona correctamente con números flotantes.
    }

    @Test
    public void testRadicacion() {
        assertEquals("TCS01", 2.0, calculadora.radicacion(4.0, 2.0), 0.001); // Funciona correctamente con un índice par y un radicando positivo.
        assertEquals("TCS02", 0.5, calculadora.radicacion(4.0, -2.0), 0.001); // Funciona correctamente con índice negativo par y radicando positivo.
        assertEquals("TCS03", 0.0, calculadora.radicacion(-4.0, 2.0), 0.001); // Cae en la condición y regresa 0.0.
        // TCS03 no se puede realizar ya que A y B no son valores válidos para el método.
        assertEquals("TCS04", 0.0, calculadora.radicacion(-1.0, 3.0), 0.001); // Asumimos que debe funcionar con un índice impar y radicando negativo pero cae en la condición y regresa 0.0.
    }

    @Test
    public void testDivision() {
        assertEquals("TCS01", 2.0, calculadora.division(-10.0, -5.0), 0.001); // Funciona correctamente con dos números negativos. Multiplica sus signos.
        assertEquals("TCS02", -2.0, calculadora.division(20.0, -10.0), 0.001); // Funciona correctamente con un número negativo.
        // TCS03 no se puede realizar ya que A y B no son valores válidos para el método.
        assertEquals("TCS04", 1.0, calculadora.division(0.5, 0.5), 0.001); // Funciona correctamente con números flotantes.
        assertEquals("TCS05", 0.0, calculadora.division(10.0, 0.0), 0.001); // Funciona correctamente, cae en la condicional e imprime 0.0.
    }

    @Test
    public void testSonAmigos() {
        assertTrue("TCS01", calculadora.sonAmigos(220, 284)); // Funciona correctamente con números positivos.
        assertTrue("TCS02", calculadora.sonAmigos(1184, 1210)); // Funciona correctamente con números positivos.
        assertFalse("TCS03", calculadora.sonAmigos(15, 25)); // Funciona correctamente con números positivos.
        assertFalse("TCS04", calculadora.sonAmigos(-220, -384)); // Funciona correctamente con números negativos.
        assertFalse("TCS05", calculadora.sonAmigos(-220, 384)); // Funciona correctamente con números negativos.
        assertFalse("TCS06", calculadora.sonAmigos(0, 0)); // Funciona correctamente con valores de cero.
    }

    @Test
    public void testSumaDivisores() {
        assertEquals("TCS01", 284, calculadora.sumaDivisores(220)); // Funciona correctamente con números positivos.
        assertEquals("TCS02", 1, calculadora.sumaDivisores(-220)); // Devuelve el valor establecido por defecto con números negativos.
        assertEquals("TCS03", 1, calculadora.sumaDivisores(0)); // Funciona correctamente con el número 0.
        assertEquals("TCS04", 1, calculadora.sumaDivisores(7)); // Funciona correctamente con números positivos primos.
        // TCS05 y TCS06 no se pueden realizar ya que los números flotantes no son válidos para el método.
    }

    @Test
    public void testExponenciacion() {
        assertEquals("TCS01", 4.0, calculadora.exponenciacion(2.0, 2.0), 0.001); // Funciona correctamente con dos números positivos.
        assertEquals("TCS02", 0.5, calculadora.exponenciacion(2.0, -1.0), 0.001); // Funciona correctamente con el exponente negativo.
        // TCS03 no se puede realizar ya que A y B no son valores válidos para el método.
        assertEquals("TCS04", 0.7071067811865476, calculadora.exponenciacion(0.5, 0.5), 0.001); // Funciona correctamente con números flotantes.
        assertEquals("TCS05", 1.41421356237, calculadora.exponenciacion(2.0, 0.5), 0.001); // Funciona correctamente con exponente flotante.
        assertEquals("TCS06", 4.0, calculadora.exponenciacion(-2.0, 2.0), 0.001); // Funciona correctamente con una base negativa y un exponente par.
        assertEquals("TCS07", -8.0, calculadora.exponenciacion(-2.0, 3.0), 0.001); // Funciona correctamente con una base negativa y un exponente impar.
    }
}
