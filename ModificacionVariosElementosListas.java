package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModificacionVariosElementosListas {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		List<String> listaApellidos = new ArrayList<>();
		List<Integer> listaDocumentos = new ArrayList<>();

		listaApellidos.add("González");
		listaApellidos.add("Velázquez");
		listaApellidos.add("Modric");
		listaApellidos.add("Kranevitter");

		listaDocumentos.add(564654);
		listaDocumentos.add(897897);
		listaDocumentos.add(448888);
		listaDocumentos.add(498775);

		System.out.println("----ELIJA UNA OPCIÓN----");
		System.out.println("1: Cambiar apellidos");
		System.out.println("2: Cambiar documentos");
		System.out.println("3: Salir");
		int opcion = ingreso.nextInt();

		while (opcion != 1 && opcion != 2 && opcion != 3) {
			System.err.println("Opcion incorrecta. Ingresa de nuevo: ");
			opcion = ingreso.nextInt();
		}

		if (opcion == 1) {
			System.out.println("Qué apellido desea cambiar?" + listaApellidos);
			String apellidoACambiar = ingreso.next();
			while (!listaApellidos.contains(apellidoACambiar)) {
				System.err.println("No existe ese apellido en la lista. Ingresalo de nuevo");
				apellidoACambiar = ingreso.next();
			}
			int posicionEnlaLista = listaApellidos.indexOf(apellidoACambiar);

			System.out.println("Defina el nuevo nombre: ");
			String nuevoNombre = ingreso.next();

			listaApellidos.set(posicionEnlaLista, nuevoNombre);

			System.err.println("\n-----------\n");
			System.out.println("Lista de apellidos completa: " + listaApellidos);
			System.out.println("Lista de documentos completa: " + listaDocumentos);
			for (int i = 0; i < listaApellidos.size(); i++) {
				System.out.println("Apellido: " + listaApellidos.get(i) + ", en la posición de la lista: " + i
						+ ",con DNI: " + listaDocumentos.get(i));
			}
		} else if (opcion == 2) {
			System.out.println("El documento de quien desea modificar?" + listaApellidos);
			String apellidoACambiar = ingreso.next();
			while (!listaApellidos.contains(apellidoACambiar)) {
				System.err.println("No existe ese nombre. Ingresalo de nuevo");
				apellidoACambiar = ingreso.next();
			}
			int posicionEnlaLista = listaApellidos.indexOf(apellidoACambiar);

			System.out.println("Defina el nuevo documento: ");
			int nuevoDocumento = ingreso.nextInt();

			listaDocumentos.set(posicionEnlaLista, nuevoDocumento);

			System.err.println("\n-----------\n");
			System.out.println("Lista de apellidos completa: " + listaApellidos);
			System.out.println("Lista de documentos completa: " + listaDocumentos);
			for (int i = 0; i < listaApellidos.size(); i++) {
				System.out.println("Apellido: " + listaApellidos.get(i) + ", en la posición de la lista: " + i
						+ ",con DNI: " + listaDocumentos.get(i));
			}
		} else if (opcion == 3) {
			System.err.println("\n-----------\n");
			System.out.println("Lista de apellidos completa: " + listaApellidos);
			System.out.println("Lista de documentos completa: " + listaDocumentos);
			for (int i = 0; i < listaApellidos.size(); i++) {
				System.out.println("Apellido: " + listaApellidos.get(i) + ", en la posición de la lista: " + i
						+ ",con DNI: " + listaDocumentos.get(i));
			}
		}
	}
}
