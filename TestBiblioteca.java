package claseLibre_Composicion;

public class TestBiblioteca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Biblioteca biblio1= new Biblioteca("Biblioteca de María Moliner", "Villaverde", 917230194);
		Libro libro1 = new Libro ("Titlerino", "Autorino", 123);
		
		System.out.println(biblio1.toString() + libro1.toString());
		System.out.println();
		
		System.out.println(biblio1.darHorario('S'));
		
		System.out.println("");
		System.out.println(libro1.prestarLibro("02352354G"));
		System.out.println("");
		System.out.println(biblio1.toString() + libro1.toString());
		
		System.out.println("");
		System.out.println(libro1.prestarLibro("02352354G"));
		System.out.println("");
		System.out.println(biblio1.toString() + libro1.toString());
		
		System.out.println("");
		System.out.println(libro1.prestarLibro("034534545"));
		System.out.println("");
		System.out.println(biblio1.toString() + libro1.toString());
		
		System.out.println("");
		System.out.println(libro1.devolverLibro("034534545"));
		System.out.println("");
		System.out.println(biblio1.toString() + libro1.toString());

	}

}
