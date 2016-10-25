import java.util.HashSet;

// Referencias:
//
// Vídeo 180 y 181 - Colecciones
//
// Crear banco con clientes y manejarlo en una colección
//

public class V180_CuentasUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Crea clientes
		V180_Cliente cl1 = new V180_Cliente("Antonio Martínez", "00001", 200000.00);
		V180_Cliente cl2 = new V180_Cliente("Rafael Pérez", "00002", 250000.00);
		V180_Cliente cl3 = new V180_Cliente("Penélope López", "00003", 300000.00);
		V180_Cliente cl4 = new V180_Cliente("Julio Jiménez", "00004", 500000.00);

		// Para probar que no admite duplicados
		V180_Cliente cl5 = new V180_Cliente("Antonio Martínez", "00001", 200000.00);

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
		HashSet<V180_Cliente> clientesBanco = new HashSet<V180_Cliente>();

		// Agregar los clientes a la colección
		clientesBanco.add(cl1);
		clientesBanco.add(cl2);
		clientesBanco.add(cl3);
		clientesBanco.add(cl4);

		// Tiene que fallar por ser duplicado, pero inicialmente sí que lo agrega!
		clientesBanco.add(cl5);

		// Lo agrega porque inicialmente el método equals() no sabe distinguir
		// si dos objetos de esta clase son iguales.
		// Hay que sobreescribir el método equals() para que sepa distinguirlos
		// en base al criterio que queramos establecer.
		
		// Ojo! Al sobreescribir equals() ya no lo agrega, pero no da ningún error.
		
		for (V180_Cliente cliente : clientesBanco) {
			System.out.printf("%-30s\t%-10s\t%10.2f\n", cliente.getNombre(), cliente.getN_cuenta(), cliente.getSaldo());
		}
	}

}
