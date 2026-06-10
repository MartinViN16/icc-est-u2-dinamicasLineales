# Práctica: Estructuras Dinámicas Lineales

## Datos del Estudiante
- **Nombre:** Martín Alberto Villacrés Núñez
- **Curso:** Grupo 1
- **Fecha:** 10/06/2026

---

## 1. Implementación de estructuras dinámicas lineales

**Fecha:** 10/06/2026

**Descripción:** 
Se realizaron 3 métodos estáticos para explorar las funciones de cada estructura dinámica lineal. Stack, Queue y linkedList. También en el ejercicio 1 se realizó un método que invierte una palabra usando una pila para guardar los valores y mediante pop e invert usando LIFO devuelve el texto invertido.

### Captura de salida en consola

![Captura de salida en consola](assets/01-captura-salida-consola.png)

### Captura del código de implementación del ejercicio 1


import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio1 {

    public String invertString(String texto){
        Deque<Character> pila = new ArrayDeque<>();
        String invert = "";
        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        while (!pila.isEmpty()) {
            invert += pila.pop();
        }
        return invert;
    }
}



## 2. Ejercicio Palíndromo

**Fecha:** 10/06/2026

**Descripción:**
Se creó un método que mediante una pila invierte el orden de la palabra, para luego usar equals ignorando mayusculas o minusculas para comparar ambos textos y verificar si son iguales devolverá un true dando como verdadero el palindromo.

### Método implementado


import java.util.ArrayDeque;
import java.util.Deque;

public class Ejercicio2 {
    public boolean esPalindromo(String texto) {

        Deque<Character> pila = new ArrayDeque<>();
        String invertido = "";
        for(char letra : texto.toCharArray()){
            pila.push(letra);
        }
        while (!pila.isEmpty()) {
            invertido += pila.pop();
        }

        return texto.equalsIgnoreCase(invertido);   
    } 
}

### Captura de salida en consola

![Captura de salida en consola](assets/02-captura-salida-consola.png)