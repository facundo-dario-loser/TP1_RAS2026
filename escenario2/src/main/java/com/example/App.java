package com.example;

public class App 
{
    public static int sumarElementos(int[] numeros) {
        int suma = 0;

        for (int i = 0; i < numeros.length - 1; i++) {
            suma += numeros[i];
        }

        return suma;
    }
}
