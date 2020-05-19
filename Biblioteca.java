/**BIBLIOTECA 
* // En la clase BIBLIOTECA se han tomado como referencia las bibliotecas p�blicas de la Comunidad de Madrid.
*
*  -  nombre: String
*  -  localidad: String
*  -  telefono: int
*  -  diaSemana: char
*
*  + Constructor () //Constructor vac�o. Devuelve por defecto el n�mero de Atenci�n al Ciudadano (012).
*  + Constructor (nombre, direccion, telefono)
*  //No existe constructor copia puesto que resulta complicado replicar una biblioteca entera.
*
*  +  Getters y setters
* 
*  + darHorario char (char diaSemana) Indica el horario de la biblioteca un d�a dado, teniendo en cuenta que las bibliotecas p�blicas tienen un horario distinto seg�n si el d�a (de lunes a viernes abre de 9:00 a 21:00 horas y s�bados y domingos de 11:00 a 19:00).
* 
*  +  toString
*  @author Alexandra Campoamor S�nchez
**/

package claseLibre_Composicion;

public class Biblioteca {

	//Propiedades
	private String nombre;
	private String localidad;
	private int telefono;
	private String horario;

	//Constructores
	public Biblioteca() {
		this.telefono = 012;
	}
	
	public Biblioteca(String nombre, String localidad, int telefono) {
		this.nombre = nombre;
		this.localidad = localidad;
		this.telefono = telefono;		
	}
	
	//Getters y setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	//M�todos
	public String darHorario (char diaSemana) {
		switch (diaSemana) {
		case 'L':
		case 'M':
		case 'X':
		case 'J':
		case 'V':
			setHorario("9:00 a 21:00"); 
			break;
		case 'S':
		case 'D':
			setHorario ("11:00 a 19:00");
			break;
		}
		return this.horario;
	}

	@Override
	public String toString() {
		return "Biblioteca: " + getNombre() + "(" + getLocalidad() + ")" +'\n'+
				"- Tel�fono: "+ getTelefono() + '\n' + "-------------------------------------" + '\n' ;
	}
	
}
