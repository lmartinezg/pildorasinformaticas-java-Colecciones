// Referencias:
//
// Vídeo 183 - Iteradores
//
// Reutilizar el código del vídeo 180 para utilizar iteradores
//

import java.util.HashSet;
import java.util.Iterator;

public class V183_CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea clientes
		V183_Cliente cl1 = new V183_Cliente("Antonio Martínez", "00001", 200000.00);
		V183_Cliente cl2 = new V183_Cliente("Rafael Pérez", "00002", 250000.00);
		V183_Cliente cl3 = new V183_Cliente("Penélope López", "00003", 300000.00);
		V183_Cliente cl4 = new V183_Cliente("Julio Jiménez", "00004", 500000.00);

		// Para probar que no admite duplicados
		V183_Cliente cl5 = new V183_Cliente("Antonio Martínez", "00001", 200000.00);

		// Crea la colección
		// Tipo de colección: Set
		// Sin duplicados
		// Uso sencillo del método add()

		// Indicar el tipo de dato genérico a utilizar <Cliente>

		// Esto falla:
		// Set <Cliente> clientesBanco = new Set<Cliente>();
		// No se puede instanciar una interfaz
		// Hay que buscar una clase que implemente la interfaz

		// Se elige la clase HashSet
		HashSet<V183_Cliente> clientesBanco = new HashSet<V183_Cliente>();

		// Agregar los clientes a la colección
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);

		// Tiene que fallar por ser duplicado, pero inicialmente sí que lo
		// agrega!
		clientesBanco.add(cl5);

		// Lo agrega porque inicialmente el método equals() no sabe distinguir
		// si dos objetos de esta clase son iguales.
		// Hay que sobreescribir el método equals() para que sepa distinguirlos
		// en base al criterio que queramos establecer.

		// Ojo! Al sobreescribir equals() ya no lo agrega, pero no da ningún
		// error.

		// for (V183_Cliente cliente : clientesBanco) {
		// System.out.printf("%-30s\t%-10s\t%10.2f\n", cliente.getNombre(),
		// cliente.getN_cuenta(), cliente.getSaldo());
		// }

		// Sustituir el for-each por un interador
		System.out.println("Iterador:");
		Iterator<V183_Cliente> it = clientesBanco.iterator();
		while (it.hasNext()) {
			String nombre_cliente = it.next().getNombre();
			System.out.println(nombre_cliente);
		}
		System.out.println("------------------------------------------------------");

		// Bucle for-each para eliminar un elemento de la colección:
		System.out.println("For-Each:");
		for (V183_Cliente cliente : clientesBanco) {
			if (cliente.getNombre().equals("Penélope López")) {
				// Provoca una excepción por modificación concurrente
				// clientesBanco.remove(cliente);
			}
		}
		// Bucle for-each para imprimir los elementos que quedan
		for (V183_Cliente cliente : clientesBanco) {
			System.out.printf("%-30s\t%-10s\t%10.2f\n", cliente.getNombre(), cliente.getN_cuenta(), cliente.getSaldo());
		}
		System.out.println("------------------------------------------------------");

		// Utilizar un iterador que sí permite eliminar elementos
		System.out.println("Iterador (2):");
		Iterator<V183_Cliente> it2 = clientesBanco.iterator();
		while (it2.hasNext()) {
			String nombre_cliente = it2.next().getNombre();
			if (nombre_cliente.equals("Penélope López")) {
				it2.remove();
			}
		}
		// Imprime los elementos que quedan en la colección
		for (V183_Cliente cliente : clientesBanco) {
			System.out.printf("%-30s\t%-10s\t%10.2f\n", cliente.getNombre(), cliente.getN_cuenta(), cliente.getSaldo());
		}
		System.out.println("------------------------------------------------------");

	}

}
