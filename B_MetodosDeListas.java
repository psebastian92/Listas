package listas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class B_MetodosDeListas {
	public static void main(String[] args) {
		ArrayList<String> frutas = new ArrayList<>();

		// AGREGAR ELEMENTOS A UNA LISTA -> nombreDeLaLista.add()
		frutas.add("Manzana");
		frutas.add("Banana");
		frutas.add("Cereza");

		// MOSTRAR EN PANTALLA LA LISTA ENTERA, ENTRE CORCHETES -> [Manzana, Banana,
		// Cereza]
		System.out.println("----------------");
		System.err.println("MOSTRAR EN PANTALLA LA LISTA ENTERA, ENTRE CORCHETES ");
		System.out.println(frutas);

		// METODO SORT: ORDENA DE MENOR A MAYOR (TANTO STRING, COMO NUMEROS).
		System.out.println("----------------");
		System.err.println("METODO SORT");
		Collections.sort(frutas); // NO escribir el nombre la lista, si no mas bien "Collections".
		System.out.println(frutas); // Output: [Banana, Cereza, Manzana]

		// METODO GET: OBTENER UN ELEMENTO DE LA LISTA -> nombreDeLaLista.get()
		System.out.println("----------------");
		System.err.println("METODO GET");
		String primeraFruta = frutas.get(0); // Al igual que en un array, las listas comienzan de 0.
		System.out.println(primeraFruta); // Manzana

		// METODO INDEXOF: SEG�N UN ELEMENTO DADO, BUSCAR SU �NDICE.
		System.out.println("----------------");
		System.err.println("METODO INDEX OF");
		int posicionEnLaLista = frutas.indexOf("Manzana");
		System.out.println("El elemento manzana esta en la posicion: " + posicionEnLaLista); // En pantalla: true
		System.out.println("Corroboramos la posicion del elemento seleccionado" + frutas);

		// METODO REMOVE (CON STRINGS) :ELIMINAR ELEMENTOS DE UNA LISTA ->
		// nombreDeLaLista.remove()
		/*
		 * IMPORTANTE: al aplicar el metodo REMOVE, la lista se reordena Ejemplo: Tengo
		 * Manzana(0), Banana(1), Cereza(2) y Pera(3). Si borro Banana, que esta en la
		 * posicion 1, Cereza ira a la posicion 1, y pera a la posicion 2.
		 */
		System.out.println("----------------");
		System.err.println("METODO REMOVE (con String especifico)");
		frutas.remove("Banana");
		System.out.println(frutas); // En pantalla: [Cereza, Manzana]

		// METODO REMOVE (POR INDICE) :ELIMINAR ELEMENTOS DE UNA LISTA ->
		// nombreDeLaLista.remove()
		/*
		 * IMPORTANTE: al aplicar el metodo REMOVE, la lista se reordena Ejemplo: Tengo
		 * Manzana(0), Banana(1), Cereza(2) y Pera(3). Si borro Banana, que esta en la
		 * posicion 1, Cereza ira a la posicion 1, y pera a la posicion 2.
		 */
		System.out.println("----------------");
		System.err.println("METODO REMOVE (por indice).");
		frutas.remove(1); // Recordar que teníamos [Cereza, Manzana], por ende, ahora se borra Manzana
							// (indice 1).
		System.out.println(frutas); // En pantalla: [Cereza]
		/*
		 * IMPORTANTE: podemos combinar el metodo index of con el metodo remove, en caso
		 * de querer buscar un elemento especifico.
		 * 
		 * Ejemplo: System.out.println("Que elemento desea borrar?");
		 * 
		 * String elementoABorrar = entrada.next(); Ingresamos el elemento "Manzana",
		 * por ejemplo.
		 * 
		 * int posicionEnLaLista = frutas.indexOf(elementoABorrar);
		 * 
		 * frutas.remote(posicionEnLaLista);
		 * 
		 * Lo que se hace, es pedirle al usuario un elemento de la lista. Se almacena,
		 * se busca la posicion de ese elemento, se guarda la posicion, y luego se borra
		 * el elemento en dicha posicion.
		 */

		// VUELVO A AGREGAR "Manzana", SOLO PARA UTILIZAR LOS METODOS SIGUIENTES
		frutas.add("Manzana");

		// METODO CONTAINS: VERIFICAR SI EXISTE EXACTAMENTE UN ELEMENTO DE LA LISTA
		// PARTICULAR
		System.out.println("----------------");
		System.err.println("METODO CONTAINS");
		boolean contieneManzana = frutas.contains("Manzana");
		System.out.println("Existe el elemento Manzana? " + contieneManzana); // En pantalla: true

		// METODO SIZE: OBTENER LA CANTIDAD DE ELEMENTOS DE LA LISTA ->
		// nombreDeLaLista.size()
		System.out.println("----------------");
		System.err.println("METODO SIZE");
		int tamano = frutas.size();
		System.out.println("Cuantos elementos tiene la lista? " + tamano); // Esto nos dara como resultado: 2 (porque
																			// habia 3, pero se elimino 1).

		// RECORRER UNA LISTA: USAR FOREACH
		System.out.println("----------------");
		System.err.println("Elementos de la lista");
		for (String fruta : frutas) { // La variable "fruta" del tipo String, va tomando los valores de cada elemento
										// de la lista. Uno a la vez.
			System.out.println(fruta);
		}

		// METODO SET: asignar un valor a un determinado indice de la lista.
		System.out.println("----------------");
		System.err.println("METODO SET");
		frutas.set(1, "Mango"); // Modificar el segundo elemento (indice 1)
		System.out.println(frutas);

		// METODO CLEAR: VACIAR LA LISTA -> nombreDeLaLista.clear()
		System.out.println("----------------");
		System.err.println("METODO CLEAR");
		frutas.clear();
		System.out.println("Contenido de la lista: " + frutas); // En pantalla: []

	}

}
