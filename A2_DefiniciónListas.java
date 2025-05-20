package listas;

import java.util.List;
import java.util.ArrayList;

public class A2_DefiniciónListas {
	public static void main(String[] args) {
		// Creamos una lista vac�a
		List<String> lista = new ArrayList<>();
		
		/* Agregamos elementos a la lista. La misma, va aumentando su
		   tamaño en función 
		*/
		lista.add("Elemento 1");
		lista.add("Elemento 2");
		lista.add("Elemento 3");

		// Imprimimos la lista
		System.out.println("Tamaño de la lista: "+lista.size() + " elementos."); 
		System.err.println("------------------");
		System.out.println("Lista creada por programa:");
		for (String elemento : lista) {
			System.out.println(elemento);
		}
	
	}
	
}
