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

import java.util.Scanner;

public class A_DefinicionListas {
	public static void main(String[] args) {
		// Creamos una lista vacía
		// Dentro de <> va el tipo de dato.
	
		List<String> listaDeProductos = new ArrayList<>();
		List<Integer> listaDePrecios = new ArrayList<>();

		// Creamos un objeto Scanner para leer la entrada del usuario
		Scanner scanner = new Scanner(System.in);

		// Solicitamos al usuario ingresar elementos hasta que ingrese "fin"

		System.out.println("Ingrese elementos a la lista (escriba 'fin' para terminar):");

		int precioProducto;
		while (true) {
			System.out.println("Nombre del producto: ");

			String ingresoNombreProducto = scanner.next();
			listaDeProductos.add(ingresoNombreProducto);
			if (ingresoNombreProducto.equalsIgnoreCase("fin")) {
				break;
			}

			System.out.println("Precio: ");
			precioProducto = scanner.nextInt();
			listaDePrecios.add(precioProducto);

			System.out.println("----------");
		}
		listaDeProductos.remove("fin");

		// Imprimimos la lista
		System.out.println("Lista creada por el usuario:");
		for (String elemento : listaDeProductos) {
			System.out.println(elemento);
		}
		System.out.println("Cantidad de elementos: " + listaDeProductos.size());

		// Cerramos el scanner
		scanner.close();
	}
}
