// LISTAS: estructuras de datos ordenadas, modificables, y cada una del mismo tipo de datos (string, int, char, float, etc).

package Listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class E_HashSet {

	public static void main(String[] args) {
        // Paso 1: Crear una lista de enteros con duplicados
		ArrayList<Integer> numeros = new ArrayList<>(); // ArrayList permite elementos duplicados.
		numeros.add(5);
		numeros.add(10);
		numeros.add(15);
		numeros.add(10);
		numeros.add(20);
		numeros.add(5);
		numeros.add(25);
		System.out.println("Lista con duplicados: " + numeros);
		
		// Paso 2: Crear un HashSet y añadir todos los elementos de la lista "numeros"
		HashSet<Integer> set = new HashSet<>(numeros);

		// Paso 3: Limpiar la lista original
		numeros.clear();

		// Paso 4: Añadir todos los elementos del HashSet de vuelta a la lista, ya que HashSet NO permite elementos duplicados.
		numeros.addAll(set);

		// Paso 5: Imprimir la lista sin duplicados
		Collections.sort(numeros);
		System.out.println("Lista sin duplicados: " + numeros);
		
	
	}

}