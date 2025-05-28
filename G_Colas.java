package Listas;

import java.util.LinkedList;  // Usamos LinkedList para implementar la cola
import java.util.Queue;       // Usamos la interfaz Queue

public class G_Colas {

    public static void main(String[] args) {

        // Creamos la cola para los clientes
        Queue<String> cola = new LinkedList<>();

        // Agregamos personas a la cola (como si llegaran a la heladería)
        cola.add("Ana");
        cola.add("Bruno");
        cola.add("Carlos");
        cola.add("Diana");
        cola.add("Elena");
        cola.add("Facundo");
        cola.add("Gabriel");

        // Mostramos todas las personas en la cola
        System.out.println("Personas en la cola: " + cola);
        // Salida esperada: [Ana, Bruno, Carlos, Diana, Elena, Facundo, Gabriel]

        // Atendemos a los primeros 3 clientes
        String atendido1 = cola.poll();  // Ana
        System.out.println("Atendiendo a: " + atendido1);

        System.err.println("Aplicamos el metodo POLL para quitar a " + atendido1);
        
        String atendido2 = cola.poll();  // Bruno
        System.out.println("Atendiendo a: " + atendido2);

        System.err.println("Aplicamos el metodo POLL para quitar a " + atendido2);
        
        String atendido3 = cola.poll();  // Carlos
        System.out.println("Atendiendo a: " + atendido3);

        System.err.println("Aplicamos el metodo POLL para quitar a " + atendido3);
        
        // Mostramos cómo está la cola después de atender a los 3 primeros
        System.out.println("Personas en la cola ahora: " + cola);
        // Salida esperada: [Diana, Elena, Facundo, Gabriel]

        // Mostramos quién es el próximo sin eliminarlo
        String siguiente = cola.peek();
        System.out.println("El siguiente en la cola es: " + siguiente);
        // Salida esperada: Diana
    }
}
