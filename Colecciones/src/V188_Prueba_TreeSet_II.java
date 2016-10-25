import java.util.Comparator;
import java.util.TreeSet;

// Referencias:
//
// Vídeo 188 - Colecciones
//
// TreeSet en clases que no implementan la interfaz Comparator<E>
//

public class V188_Prueba_TreeSet_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> ordenaPersonas = new TreeSet<String>();

		ordenaPersonas.add("Sandra");
		ordenaPersonas.add("Amanda");
		ordenaPersonas.add("Diana");

		// Aparecen en orden alfabético
		// (String implementa la interfaz comparable)
		System.out.println("TreeSet de String");
		for (String s : ordenaPersonas) {
			System.out.println(s);
		}
		System.out.println();

		// Otro ejemplo con objetos de clase propia
		V188_Articulo a1 = new V188_Articulo(1, "Primer artículo");
		V188_Articulo a2 = new V188_Articulo(2, "Segundo artículo");
		V188_Articulo a3 = new V188_Articulo(3, "Tercer artículo");

		TreeSet<V188_Articulo> ordenaArticulos = new TreeSet<V188_Articulo>();
		ordenaArticulos.add(a3);
		ordenaArticulos.add(a1);
		ordenaArticulos.add(a2);

		// Aparecen en orden según el número de artículo
		// La clase V188_Articulo implementa Comparable
		System.out.println("TreeSet de V188_Articulo, clasificado por numero_articulo");
		for (V188_Articulo art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		System.out.println();

		// Nueva clase V188_Articulo con Comparator<E>
		// Queremos crear un objeto comparador, pero el constructor preparado
		// para V188_Articulo requiere dos parámetros (número y descripción)
		// Es necesario añadir un nuevo constructor por defecto

		// Se elimina comparadorArticulos
		// V188_Articulo comparadorArticulos = new V188_Articulo();

		// Se elimina el TreeSet
		// TreeSet <V188_Articulo> ordenaArticulos=new
		// TreeSet<V188_Articulo>(comparadorArticulos);

		V188_Articulo a21 = new V188_Articulo(1, "Primer artículo");
		V188_Articulo a22 = new V188_Articulo(2, "Segundo artículo");
		V188_Articulo a23 = new V188_Articulo(3, "Tercer artículo");

		ComparadorArticulos compara_art = new ComparadorArticulos();
		// Creamos un nuevo TreeSet pasando el comparador como parámetro
		TreeSet<V188_Articulo> ordenaArticulos2 = new TreeSet<V188_Articulo>(compara_art);
		
		ordenaArticulos.add(a23);
		ordenaArticulos.add(a21);
		ordenaArticulos.add(a22);
		System.out.println("TreeSet de V188_Articulo, clasificado por descripción");
		for (V188_Articulo art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		System.out.println();

	}

}

// Se elimina la interfaz Comparator<E>
class V188_Articulo implements Comparable<V188_Articulo> {

	// Se elimina el constructor por defecto V188_Articulo()

	public V188_Articulo(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// Compara en base al número de artículo
	@Override
	public int compareTo(V188_Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}

	// Se elimina el método compare()

	private int numero_articulo;
	private String descripcion;
}

// Creamos un comparador como clase nueva que implemente Comparator<E>
class ComparadorArticulos implements Comparator<V188_Articulo> {

	@Override
	public int compare(V188_Articulo arg0, V188_Articulo arg1) {
		// TODO Auto-generated method stub
		String desc1 = arg0.getDescripcion();
		String desc2 = arg1.getDescripcion();
		return desc1.compareTo(desc2);
	}

}