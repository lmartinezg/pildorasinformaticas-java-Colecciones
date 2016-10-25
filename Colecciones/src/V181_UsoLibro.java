// Referencias:
//
// Vídeo 181 - Colecciones
//
// Comparar elementos de una colección
// El método equals() estandard no funciona porque no sabe comparar 
// las clases de objetos que hayamos podido incluir en la colección.
// Hay que sobreescribirlo.

public class V181_UsoLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		V181_Libro libro1 = new V181_Libro("P en Java", "Juan", 25);
		V181_Libro libro2 = new V181_Libro("P en Java", "Juan", 25);
		
		// El método equals al principio falla porque no sabe comparar
		// objetos de clase Libro
		//
		// Tras sobreescribir el método equals() ya nos dice que es el mismo
		// libro por tener elmismo ISBN.
		if (libro1.equals(libro2)){
			System.out.println("Es el mismo libro");
		} else{
			System.out.println("No es el mismo libro");
		}
	}

}
