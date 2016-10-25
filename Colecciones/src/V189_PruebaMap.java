import java.util.HashMap;
import java.util.Map;

// Referencias
//
// Vídeo 189 - Colecciones - Map
//

public class V189_PruebaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();

		personal.put("145", new Empleado("Juan"));
		personal.put("146", new Empleado("Ana"));
		personal.put("147", new Empleado("Antonio"));
		personal.put("148", new Empleado("Sandra"));

		// Imprimir la colección completa
		System.out.println("Colección completa");
		System.out.println(personal);
		System.out.println();

		// Eliminar un elemento
		personal.remove("147");
		System.out.println("Elemento 147 eliminado");
		System.out.println(personal);
		System.out.println();

		// Put con clave ya existente reemplaza el elemento
		personal.put("148", new Empleado("Natalia"));
		System.out.println("Elemento 148 reemplazado");
		System.out.println(personal);
		System.out.println();

		// Imprimir la colección devuelta como Set
		// Mismo resultado que hasta ahora, salvo que antes venía entre
		// llaves (colección?) y ahora entre corchetes (Set)
		System.out.println("Imprime la colección mediate entrySet()");
		System.out.println(personal.entrySet());
		System.out.println();

		// Recorre la colección usando la interfaz interna Map.Entry<K,V>
		// y recupera la clave y valor mediante getKey() y getValue()
		System.out.println("Recorre la colección utilizando Map.Entry<K,V>");
		for (Map.Entry<String, Empleado> entrada : personal.entrySet()) {
			System.out.println("Clave=" + entrada.getKey() + ", Valor=" + entrada.getValue());
		}
		System.out.println();
	}

}

class Empleado {

	public Empleado(String n) {
		nombre = n;
		sueldo = 2000;
	}

	public String toString() {
		return ("[Nombre=" + nombre + ", sueldo=" + sueldo + "]");
	}

	private String nombre;
	private double sueldo;

}