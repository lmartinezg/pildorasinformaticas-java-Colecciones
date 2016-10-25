// Referencias:
//
// Vídeo 180 - Colecciones
//
// Crear banco con clientes y manejarlo en una colección
//

public class V180_Cliente {

	private String nombre;
	private String n_cuenta;
	private double saldo;

	public V180_Cliente(String nombre, String n_cuenta, double saldo) {
		this.nombre = nombre;
		this.n_cuenta = n_cuenta;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN_cuenta() {
		return n_cuenta;
	}

	public void setN_cuenta(String n_cuenta) {
		this.n_cuenta = n_cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	// Sobreescribir hascode() y equals() según n_cuenta
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((n_cuenta == null) ? 0 : n_cuenta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		V180_Cliente other = (V180_Cliente) obj;
		if (n_cuenta == null) {
			if (other.n_cuenta != null)
				return false;
		} else if (!n_cuenta.equals(other.n_cuenta))
			return false;
		return true;
	}
	
	

}
