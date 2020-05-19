/**LIBRO   //Da informaci�n sobre los libros y los ejemplares disponibles en una biblioteca
*  
*  -  titulo: String
*  -  autor: String
*  -  numeroID: int // Compuesto por una cifra del 1 al 3000
*  -  ejemplares: int
*
*  +  Constructor (String titulo, String autor, int numeroID) //Todos los t�tulos, adem�s, tienen 10 ejemplares en cada biblioteca.
*  +  Constructor copia
*
*  +  Getters y setters
*
*  +  prestarLibro int (int numeroID) //Presta un libro a una persona, restando un ejemplar del libro en la biblioteca.
*Devuelve el n�mero de ejemplares que quedan y las personas que tienen un ejemplar.
*  +  devolverLibro (int numeroID) //Devuelve el libro a la biblioteca. Deber�a dar informaci�n de la persona que lo ha devuelto.
*
*  +  toString
*  
*  @author Alexandra Campoamor S�nchez
**/

package claseLibre_Composicion;

public class Libro {

	// Atributos
	private String titulo;
	private String autor;
	private int numeroID; // Identificador �nico del libro.
	private int ejemplares;

	// Constructores
	public Libro(String titulo, String autor, int numeroID) {
		this.titulo = titulo;
		this.autor = autor;
		this.numeroID = numeroID;
		this.ejemplares = 10;
	}

	public Libro(Libro copia) {
		this.titulo = copia.titulo;
		this.autor = copia.autor;
		this.numeroID = copia.numeroID;
		this.ejemplares = 10;
	}

	// Getters y setters
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

	public int getNumeroID() {
		if (numeroID < 1 || numeroID > 3000) {
			this.numeroID = 0; // El cero indica un dato fuera de registro (no v�lido).
		} else {
			return numeroID;
		}
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		if (numeroID < 1 || numeroID > 3000) {
			this.numeroID = 0; // El cero indica un dato fuera de registro (no v�lido).
		} else {
			this.numeroID = numeroID;
		}
	}

	public int getEjemplares() {
		return ejemplares;
	}

	public void setEjemplares(int ejemplares) {
		if (ejemplares < 0) {
			this.ejemplares = 0;
		} else if (ejemplares > 10) {
			this.ejemplares = 10;
		}
	}

	// M�todos
	public String prestarLibro(String DNI) {
		setNumeroID(numeroID);
		setEjemplares(ejemplares--);

		return "Se ha prestado un ejemplar de " + getTitulo() + "(N�mero ID " + getNumeroID() + ")"
				+ " al usuario con DNI " + DNI;
	}

	public String devolverLibro(String DNI) {
		setNumeroID(numeroID);
		setEjemplares(ejemplares++);
		return "El usuario con DNI" + DNI + " ha devuelto un ejemplar de " + getTitulo() + "(N�mero ID " + getNumeroID()
				+ ")";
	}


	@Override
	public String toString() {
		return "- Nombre libro: " + getTitulo() + "(N�mero ID " + getNumeroID() + ")" + '\n' + "- Autor: " + getAutor()
				+ '\n' + "- Ejemplares disponibles: " + getEjemplares();
	}

}
