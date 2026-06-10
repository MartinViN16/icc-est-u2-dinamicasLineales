import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        runLinkedList();
        System.out.println("--------------");
        runQueue(); //  Colas 
        System.out.println("--------------");
        runStack();  //Pilas 
        System.out.println("--------------");
        String texto = "COMPUTACION";
        Ejercicio1 ejercicio1 = new Ejercicio1();
        String invertido = ejercicio1.invertString(texto);
        System.out.println("Palabra invertida: " + invertido);
        System.out.println("--------------");
        Ejercicio2 palindromo = new Ejercicio2();
        System.out.println();
        System.out.println("Radar es palindromo? " + palindromo.esPalindromo("Radar"));
        System.out.println("Computacion es palindromo? " + palindromo.esPalindromo("Computacion"));
        
    }

    private static void runStack() {
        Stack<String> pila = new Stack<>();
        pila.push("A");  // agrega el elemento al arreglo
        pila.push("B");
        pila.push("C");
        String elemento = pila.pop();
        System.out.println("Tamaño: " + pila.size());   
        System.out.println("Elemento: " + elemento);  

        Deque<String> pila2 = new ArrayDeque<>(); // Recomendado 
        Deque<String> pila3 = new LinkedList<>();
        pila2.push("A");
        pila3 .push("B");
        pila.pop();
        pila.pop();
    }

    private static void runQueue() {
        Queue<String> cola = new ArrayDeque<>();
        cola.offer("Jose ");
        cola.offer("Andres");
        cola.offer("Ana");
        System.out.println("Está vacío? " + cola.isEmpty());
        System.out.println("Tamaño: " + cola.size()); // imprime el tamanio desde 1 2 3 ....
        System.out.println("Cual es peek? " + cola.peek());
        System.out.println("Primero en atenderse: " + cola.poll()); // lo atiende y lo saca 
        System.out.println("Tamaño: " + cola.size());

        while (!cola.isEmpty()) {
            String cliente = cola.poll();
            System.out.println("Atendi a cliente: " + cliente);

            
        }
        //ofer  -> agrega al final 
        // peek -> devuelve el primero
        // poll -> Devuelve el primero y lo elimina 

    }

    private static void runLinkedList() {
        System.out.println("Lista Enlazada/ LinkedList");
        LinkedList<String> nombres = new LinkedList<>();
        System.out.println();
        System.out.println("Esta vacio? " + nombres.isEmpty());
        System.out.println("Tamanio " + nombres.size());
        nombres.add("Juan");
        nombres.add("Pedro");
        nombres.add("Maria");
        nombres.add("Diego");
       
        System.out.println("Primero: " + nombres.getFirst());
        System.out.println("Tercero: " + nombres.get(2));
        System.out.println("Último: " + nombres.getLast());
        System.out.println();

        System.out.println("Primer elemento (peek): " + nombres.peek()); // peek retorna el primer elemento pero no lo saca o elimina 
        System.out.println("Elemento eliminado: " + nombres.pop()); // pop elimina el primer elemento de la lista 
        System.out.println("Tamaño: " + nombres.size());// Devuelve el tamanio

    }
}