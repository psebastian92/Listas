// Un HashSet es una estructura de datos en Java que se usa para guardar elementos sin repetirlos y sin importar el orden.
// Elimina elementos duplicados, pero NO guarda elementos por índice ordenadamente como una lista, o un array.
// HashSet NO es una lista. Pertenece al grupo de Colecctions (al igual que las listas), pero no es exactamente lo mismo.
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
		// HashSet NO puede acceder a sus elementos por índice ( get.(i) ) como una lista. 
		// Por eso, hay que vaciar la lista "numeros" y agregarle todos los elementos de HashSet.
		numeros.addAll(set);

		// Paso 5: Imprimir la lista sin duplicados
		Collections.sort(numeros);
		System.out.println("Lista sin duplicados: " + numeros);
	/*
	 * EN RESUMEN:
	 * - Se crea una lista. Se le ingresan datos.
	 * - Se pasan todos los datos a un HashSet, que elimina duplicados.
	 * - Se vacía la primera lista.
	 * - Se pasan todos los elementos de HashSet a la lista.
	 * */
	}

}