# TP1_RAS2026
Repositorio con el codigo correspondiente al tp1 de reparación automática de software

## Organización
- **/src**:
    - **/main/java**: contiene los programas java con bugs/errores.
    - **/test/java**: contiene los tests con JUnit.

- **/target**: carpeta generada por PraPr con reportes.

## Instrucciones para compilar y ejecutar
Tener instalado maven.
Ejecutar en la terminal estando parado en la raiz del proyecto (/TP1_RAS2026).

Para ejecutar los tests:
```
mvn test
```

Para correr PraPr:
```
mvn org.mudebug:prapr-plugin:prapr
```
Luego de esto PraPR genera una carpeta llamada `/target` dentro de la carpeta raiz del proyecto.

## Extra
```
mvn clean org.mudebug:prapr-plugin:prapr
```
