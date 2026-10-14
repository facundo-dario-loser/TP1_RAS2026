package com.example;

public class App 
{
    public int buscarElemento(int[] arreglo, int objetivo) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == objetivo) {
                return medio; // Elemento encontrado
            }

            // BUG: puso < en lugar de >
            if (arreglo[medio] < objetivo) {
                derecha = medio - 1; 
            } else {
                izquierda = medio + 1;
            }
        }
        return -1; // No encontrado
    }
}
