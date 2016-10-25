// Referencias:
//
// Vídeo 185 - LinkedList II
//
// Uso de iterador y sus métodos para añadir y eliminar elementos
//
// Reposicionar al principio de la colección:
// iterA=paises.listIterator()
//
// Métodos:
// hasnext()
// next()
// add()
// remove()
// removeAll()


import java.util.LinkedList;
import java.util.ListIterator;

public class V185_PruebaListasEnlazadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> paises = new LinkedList<String>();

		paises.add("España");
		paises.add("Colombia");
		paises.add("México");
		paises.add("Perú");

		LinkedList<String> capitales = new LinkedList<String>();

		capitales.add("Madrid");
		capitales.add("Bogotá");
		capitales.add("DF");
		capitales.add("Lima");

		System.out.println(paises);
		System.out.println(capitales);
		System.out.println();

		// Agregar los elementos de capitales a la colección paises
		// Cada capital detrás de su país
		ListIterator<String> iterA = paises.listIterator();
		ListIterator<String> iterB = capitales.listIterator();

		while (iterB.hasNext()) {
			if (iterA.hasNext()) {
				// Avanza al siguiente elemento de paises
				iterA.next();
				// Añade el siguiente elemento de capitales
				iterA.add(iterB.next());
			}
		}
		System.out.println(paises);
		System.out.println();

		// Elimina los elementos pares de capitales

		// Posiciona el iterador al principio de la colección
		System.out.println("Antes:");
		System.out.println(capitales);
		iterB = capitales.listIterator();

		while (iterB.hasNext()) {
			// Avanza una posición
			iterB.next();
			if (iterB.hasNext()) {
				// Avanza otra posición
				iterB.next();
				// Y la elimina
				iterB.remove();
			}
		}
		System.out.println("Después:");
		System.out.println(capitales);
		System.out.println();

		// Elimina de la colección paises los elementos actuales de capitales
		System.out.println("Eliminar de paises los elementos de la colección capitales:");
		paises.removeAll(capitales);
		System.out.println(paises);
		System.out.println();
	}

}
