package Listas;

import java.util.Scanner;
import java.util.Stack;

public class F_Pilas {
    public static void main(String[] args) {
        Stack<String> acciones = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Editor de dibujo ---");
            System.out.println("1. Dibujar una línea");
            System.out.println("2. Dibujar un círculo");
            System.out.println("3. Deshacer última acción");
            System.out.println("4. Ver última acción");
            System.out.println("5. Mostrar historial de acciones");
            System.out.println("6. Salir");
            System.out.print("Elegí una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    acciones.push("Dibujó una línea");
                    System.out.println("Acción guardada: Dibujó una línea");
                    break;

                case 2:
                    acciones.push("Dibujó un círculo");
                    System.out.println("Acción guardada: Dibujó un círculo");
                    break;

                case 3:
                    if (!acciones.isEmpty()) {
                        String deshecha = acciones.pop();
                        System.out.println("Deshiciste: " + deshecha);
                    } else {
                        System.out.println("No hay acciones para deshacer.");
                    }
                    break;

                case 4:
                    if (!acciones.isEmpty()) {
                        System.out.println("Última acción: " + acciones.peek());
                    } else {
                        System.out.println("Aún no hiciste ninguna acción.");
                    }
                    break;

                case 5:
                    System.out.println("Historial de acciones: " + acciones);
                    break;

                case 6:
                    System.out.println("Saliendo del editor...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}
