package poo_3;
import javax.swing.*;
public class Uso_Libro {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			Libro libro1= new Libro("Paula", "Isabel Allende", 50);
			
			libro1.pr�stamo();
			
			System.out.println("Prest� "+libro1.cuantos_libros_prest�()+" libros");
			
			System.out.println("Tengo en stock "+libro1.dame_stock()+" libros");

			libro1.devoluci�n();
			
			System.out.println("Tengo en stock "+libro1.dame_stock()+" libros");
			
			System.out.println("Tengo en prestamo "+libro1.cuantos_libros_prest�()+" libros");
		}

	}

	