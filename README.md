# Reparación Automática de Software 
## Trabajo Práctico 1: Evaluación de Artículos - Ejercicio 3

### Artículo seleccionado: Practical Program Repair via Bytecode Mutation

**Integrantes:** Campregher Bruno, Loser Facundo y Machuca Franco.

## Requisitos Previos

* **Java Development Kit (JDK):** Versión 1.8
* **Apache Maven:** Instalado y configurado en el sistema.

## Organización

El repositorio se organiza mediante carpetas independientes para cada escenario de prueba. Cada una de ellas contiene un proyecto Maven con la siguiente estructura:

**`/src/main/java`**: Contiene los programas Java con los defectos a reparar.

**`/src/test/java`**: Contiene los tests unitarios implementados con JUnit.

**`/target`**: Carpeta utilizada por PraPR para almacenar los reportes y mutantes.

**`/target/prapr-reports/[timestamp]/`**: Carpeta generada por PraPR con un identificador numérico de fecha y hora que almacena los reportes y mutantes.

**`/target/prapr-reports/.../pool/`**: Contiene archivos `.class` de los mutantes generados que solucionan el defecto.

## Instrucciones para compilar y ejecutar

Para ejecutar cada escenario, es necesario posicionarse en la carpeta correspondiente al escenario que se desea probar (por ejemplo, `/escenario1`, `/escenario2` o `/escenario3`).

**Ejecutar los tests unitarios:**

```bash
  mvn test
```

**Ejecutar la herramienta PraPR:**

```bash
mvn org.mudebug:prapr-plugin:prapr
```

**Extra:** Ejecutar limpieza completa antes de correr PraPR:
```
mvn clean org.mudebug:prapr-plugin:prapr
```

# Escenarios

Para aplicar la técnica del artículo seleccionado, se definieron tres escenarios de prueba. A continuación se detalla cada uno de ellos:

**Escenario 1**

Consiste en evaluar la reparación de un método que valida la mayoría de edad. El defecto radica en el uso de un operador relacional estricto (`>`) en lugar de uno inclusivo (`>=`), lo que provoca que el test unitario falle al evaluar un caso límite exacto (una persona con 18 años) debido a que el sistema rechaza el valor con un false incorrecto. 

**Escenario 2**

Consiste en evaluar la reparación de un método que calcula la suma de los elementos de un arreglo numérico. El defecto radica en una condición de límite incorrecta en el bucle, lo que provoca que los tests unitarios fallen al omitir el último elemento del arreglo.

**Escenario 3**

Consiste en evaluar la reparación de un algoritmo de búsqueda binaria. El defecto radica en una lógica invertida al ajustar los límites de búsqueda, lo que provoca que el test unitario falle al buscar un elemento presente en el arreglo.