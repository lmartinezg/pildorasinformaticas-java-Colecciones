import java.util.Comparator;
import java.util.TreeSet;

// Referencias:
//
// Vídeo 185 a 187 - Colecciones - TreeSet
//
// Interfaz Comparable
// En el TreeSet los elementos aparecen ordenados según se haya definido
// el método CompareTo en la clase del objeto que contenga el TreeSet
//
// Interfaz Comparator

public class V186_Prueba_TreeSet {

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
		Articulo a1 = new Articulo(1, "Primer artículo");
		Articulo a2 = new Articulo(2, "Segundo artículo");
		Articulo a3 = new Articulo(3, "Tercer artículo");

		TreeSet<Articulo> ordenaArticulos = new TreeSet<Articulo>();
		ordenaArticulos.add(a3);
		ordenaArticulos.add(a1);
		ordenaArticulos.add(a2);
		
		// Aparecen en orden según el número de artículo
		// La clase Articulo implementa Comparable
		System.out.println("TreeSet de Articulo, clasificado por numero_articulo");
		for (Articulo art : ordenaArticulos) {
			System.out.println(art.getDescripcion());
		}
		System.out.println();
		
		// Nueva clase Articulo2 con Comparator<E>
		// Queremos crear un objeto comparador, pero el constructor preparado 
		// para Articulo2 requiere dos parámetros (número y descripción)
		// Es necesario añadir un nuevo constructor por defecto
		Articulo2 comparadorArticulos2 = new Articulo2();
		
		TreeSet <Articulo2> ordenaArticulos2=new TreeSet<Articulo2>(comparadorArticulos2);
		
		Articulo2 a21 = new Articulo2(1, "Primer artículo");
		Articulo2 a22 = new Articulo2(2, "Segundo artículo");
		Articulo2 a23 = new Articulo2(3, "Tercer artículo");
		ordenaArticulos2.add(a23);
		ordenaArticulos2.add(a21);
		ordenaArticulos2.add(a22);
		System.out.println("TreeSet de Articulo2, clasificado por descripción");
		for (Articulo2 art : ordenaArticulos2) {
			System.out.println(art.getDescripcion());
		}
		System.out.println();
		
		
	}

}

// Prueba con una clase de objetos propia
class Articulo implements Comparable<Articulo> {

	public Articulo(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// Compara en base al número de artículo
	@Override
	public int compareTo(Articulo o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}

	private int numero_articulo;
	private String descripcion;
}

// Prueba con una clase de objetos propia. Con interfaz Comparator<E>
class Articulo2 implements Comparable<Articulo2>, Comparator<Articulo2>{

	// Nuevo constructor por defecto para poder crear el comparador
	public Articulo2(){
		
	}
	
	public Articulo2(int num, String desc) {
		numero_articulo = num;
		descripcion = desc;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// Compara en base al número de artículo
	@Override
	public int compareTo(Articulo2 o) {
		// TODO Auto-generated method stub
		return numero_articulo - o.numero_articulo;
	}

	@Override
	// Desarrollar el método compare() según interese
	public int compare(Articulo2 o1, Articulo2 o2) {
		// TODO Auto-generated method stub
		String descripcionA = o1.getDescripcion();
		String descripcionB = o2.getDescripcion();
		
		// Utilizamos compareTo() de la clase String
		return descripcionA.compareTo(descripcionB);
	}

	private int numero_articulo;
	private String descripcion;
}