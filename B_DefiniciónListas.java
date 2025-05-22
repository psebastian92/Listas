/*
 * Las listas son estructuras que nos permiten guardar muchos datos del mismo tipo
 * (por ejemplo, muchos nombres o muchos precios) en una sola variable.
 * 
 * A diferencia de los arrays, las listas pueden crecer o achicarse según lo necesitemos,
 * es decir, podemos agregar o quitar elementos fácilmente.
 * 
 * En este ejemplo, usamos listas para guardar los nombres de productos y sus precios.
 * Usamos List<String> para guardar palabras (nombres de productos) y List<Integer> para guardar números (precios).
 * 
 * Las listas pertenecen a una parte de Java llamada "colecciones" y se crean con la ayuda de ArrayList.
 */

package Listas;

import java.util.List;
import java.util.ArrayList;

public class B_DefiniciónListas {
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
