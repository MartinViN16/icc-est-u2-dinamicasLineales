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
