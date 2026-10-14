package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void sumaTodosLosElementos() {
        assertEquals(9,
            App.sumarElementos(new int[]{2, 3, 4}));
    }

    @Test
    public void sumaCuandoElUltimoElementoEsCero() {
        assertEquals(5,
            App.sumarElementos(new int[]{2, 3, 0}));
    }

    @Test
    public void funcionaConUnSoloElemento() {
        assertEquals(5,
            App.sumarElementos(new int[]{5}));
    }

    @Test
    public void funcionaConArregloVacio() {
        assertEquals(0,
            App.sumarElementos(new int[]{}));
    }
}
