package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ModificacionElementoLista {
	public static void main(String[] args) {
		Scanner ingreso = new Scanner(System.in);
		List<String> listaNombres = new ArrayList<>();
		
		listaNombres.add("Juan");
		listaNombres.add("Pedro");
		listaNombres.add("Evelyn");
		listaNombres.add("Catalina");
		
		System.out.println("Desea cambiar un nombre?");
		String opcion = ingreso.next().toLowerCase();
		
		while( !opcion.contains("si") && !opcion.contains("no")  ) {
			System.err.println("Opcion incorrecta. Ingresa de nuevo: ");
			 opcion = ingreso.next().toLowerCase();
		}
		
		
		if(opcion.equalsIgnoreCase("si")) {
			System.out.println("Qué nombre desea cambiar?");
			String nombreACambiar = ingreso.next();
			while (!listaNombres.contains(nombreACambiar)) {
				System.err.println("No existe ese nombre. Ingresalo de nuevo");
				nombreACambiar = ingreso.next();
			}
			int posicionEnlaLista = listaNombres.indexOf(nombreACambiar);
			
			System.out.println("Defina el nuevo nombre: ");
			String nuevoNombre = ingreso.next();
			
			listaNombres.set(posicionEnlaLista, nuevoNombre);
			
			System.err.println("\n-----------\n");
			System.out.println("Lista completa: "+listaNombres);
			for (int i = 0; i < listaNombres.size(); i++) {
				System.out.println("Nombre: " + listaNombres.get(i) + ", en la posición de la lista: " + i);
			}
		} else {
			System.err.println("\n-----------\n");
			System.out.println("Lista completa: "+listaNombres);
			for (int i = 0; i < listaNombres.size(); i++) {
				System.out.println("Nombre: " + listaNombres.get(i) + ", en la posición de la lista: " + i);
			}
		}
	}
}
