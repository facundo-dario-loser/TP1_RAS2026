package com.example;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testBuscarEnArregloOrdenado() {
        App algoritmo = new App();
        int[] datos = {2, 4, 6, 8, 10, 12};
        
        // Buscamos el número 10. Debería estar en el índice 4.
        // Debido al bug, el test va a fallar (devolverá -1).
        assertEquals(4, algoritmo.buscarElemento(datos, 10));
    }
}
