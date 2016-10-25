// Referencias:
//
// Vídeo 184 - LinkedList - Listas enlazadas
//
// Interfaz ListIterator

import java.util.LinkedList;
import java.util.ListIterator;

public class V184_PruebaLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> personas = new LinkedList<String>();

		personas.add("Pepe");
		personas.add("Sandra");
		personas.add("Ana");
		personas.add("Laura");
		personas.add("Juan");

		System.out.println("Elementos: " + personas.size());

		// Los elementos están en el mismo orden en que se añadieron
		int indice = 0;
		System.out.println("Elementos iniciales: ");
		for (String persona : personas) {
			System.out.println(indice++ + " " + persona);
		}
		System.out.println();

		personas.add(3, "Manuel");
		indice = 0;
		for (String persona : personas) {
			System.out.println(indice++ + " " + persona);
		}
		System.out.println();

		ListIterator<String> it = personas.listIterator();
		// Desplazarse una posición hacia adelante (empieza en la pos. 0)
		it.next();
		it.add("Carmen");
		indice = 0;
		for (String persona : personas) {
			System.out.println(indice++ + " " + persona);
		}
		System.out.println();

		
		
	}

	void imprimeLista(LinkedList<String> l){
		int indice = 0;
		for (String persona : l) {
			System.out.println(indice++ + " " + persona);
		}
		System.out.println();
		
	}
	
}
