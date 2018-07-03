package poo_3;
import javax.swing.*;
public class Uso_Libro {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Libro libro1= new Libro("Paula", "Isabel Allende", 50);
			
			libro1.préstamo();
			
			System.out.println("Presté "+libro1.cuantos_libros_presté()+" libros");
			
			System.out.println("Tengo en stock "+libro1.dame_stock()+" libros");

			libro1.devolución();
			
			System.out.println("Tengo en stock "+libro1.dame_stock()+" libros");
			
			System.out.println("Tengo en prestamo "+libro1.cuantos_libros_presté()+" libros");
		}

	}

	