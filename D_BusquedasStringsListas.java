package Listas;

import java.util.List;
import java.util.ArrayList;

import java.util.Scanner;

public class D_BusquedasStringsListas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Crear una lista
		List<String> nombres = new ArrayList<>();

		// Agregar elementos a la lista
		nombres.add("Esteban");
		nombres.add("Adriana");
		nombres.add("Hugo");
		nombres.add("Luciano");

		boolean encontrado = false;

		System.out.println("Ingrese un nombre a buscar");
		String nombreBuscado = scanner.next();

		for (int i = 0; i < nombres.size(); i++) {
							// en una lista, uso size() en vez de length (este es para arrays)
			// En un array: nombres[i], en una lista: nombres.get(i)
			if (nombres.get(i).equalsIgnoreCase(nombreBuscado)) { // NO se puede utilizar nombreBuscado == nombres[i]
				System.out.println("El nombre esta en lista");
				encontrado = true;
				break;
			}
		}

		if (encontrado == false) {
			System.out.println("No se encontro el nombre.");
		}

	}
}
