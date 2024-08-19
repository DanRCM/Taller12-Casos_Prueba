package com.mycompany.testcases;

public class Calculadora {
    public double suma(double a, double b) {
        return a + b;
    }

    public double resta(double a, double b) {
        return a - b;
    }

    public double multiplicacion(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            return 0.0;
        }
        return a / b;
    }

    public double exponenciacion(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double radicacion(double numero, double indice) {
        if (numero < 0) {
            return 0.0;
        }
        return Math.pow(numero, 1.0 / indice);
    }

    public boolean sonAmigos(int a, int b)
    {
        return (sumaDivisores(a) == b &&
                sumaDivisores(b) == a);
    }

    public int sumaDivisores(int x)
    {
        int sum = 1;
        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x % i == 0)
            {
                sum += i;
                // Para manejar cuadrados perfectos
                if (x / i != i)
                    sum += x / i;
            }
        }
        return sum;
    }
}
