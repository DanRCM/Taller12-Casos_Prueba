/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.testcases;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CltControl
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
    public void testSumaDivisores() {
        assertEquals("TC 1",284, calculadora.sumaDivisores(220));
        assertEquals("TC 2",1, calculadora.sumaDivisores(-220));
        assertEquals("TC 3",1, calculadora.sumaDivisores(0));
        assertEquals("TC 4",1, calculadora.sumaDivisores(7));
    }
    
    @Test
    public void testNumerosAmigos() {
        assertEquals("TC 1",false, calculadora.sonAmigos(220,384));
        assertEquals("TC 2",true, calculadora.sonAmigos(1184,1210));
        assertEquals("TC 3",false, calculadora.sonAmigos(15,25));
        assertEquals("TC 4",false, calculadora.sonAmigos(-220,-384));
        assertEquals("TC 5",false, calculadora.sonAmigos(0,0));
    }
}
