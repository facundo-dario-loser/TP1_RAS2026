package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
    @Test
    public void testJustoDieciochoAnios() {
        App programa = new App();
        // 18 debería dar true, pero por el bug dará false y fallará el test
        assertTrue(programa.esMayorDeEdad(18));
    }
}
