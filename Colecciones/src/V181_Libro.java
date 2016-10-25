// Referencias:
//
// Vídeo 181 - Colecciones
//

public class V181_Libro {

	public V181_Libro(String titulo, String autor, int ISBN) {
		this.titulo = titulo;
		this.autor = autor;
		this.ISBN = ISBN;

	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int ISBN) {
		this.ISBN = ISBN;
	}

	public String getDatos() {
		return "El título es: " + titulo + ". El autor es: " + autor + ". Y el ISBN es: " + ISBN;
	}

	// Sobreescribir el método equals()
	// El parámetro recibido tiene que ser de clase Object
	// (según descrito en la API)
	//
	// Es igual se tiene el mismo ISBN
	//
	// Para no perder el ejemplos, se redenomina equals_manual()
	public boolean equals_manual(Object obj) {

		// Verifica que el objeto sea un V181_Libro
		if (obj instanceof V181_Libro) {

			// Lo almacena en una variable de clase V181_Libro
			V181_Libro otro = (V181_Libro) obj;

			if (this.ISBN == otro.ISBN) {
				return true;
			} else {
				return false;
			}
		} else
		// Por si no fuera de tipo V181_Libro
		{
			return false;
		}

	}

	// Métodos hashcode() y equals() sobreescritos. Generados por eclipse

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ISBN;
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		V181_Libro other = (V181_Libro) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}

	private String titulo;
	private String autor;
	private int ISBN;
}
