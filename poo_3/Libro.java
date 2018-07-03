package poo_3;

import javax.swing.JOptionPane;

public class Libro {


		/*3. Crea una clase Libro con los m�todos pr�stamo, devoluci�n y toString. La clase contendr� un constructor
		 *  por defecto, un constructor con par�metros y los m�todos getters y setters.
*/

		private String nLibro;
		private String autor;
		private int stock=0;
		private int prestamos=0;
		private int cant;
		
		
		public Libro() {
			
		}
		
		public Libro(String nLibro, String autor, int stock ) {
			
			this.nLibro=nLibro;
			this.autor= autor;
			this.stock=stock;
			
			}
		
		
		public void pr�stamo () {
			
			String num= JOptionPane.showInputDialog("Ingresar cantidad de libros a prestar");
			cant= Integer.parseInt(num);
			stock-=cant;
			prestamos+=cant;
		}
		 
		public int cuantos_libros_prest�() {
			
			
			return prestamos;
			
		}
		

		public void devoluci�n () {
			
			String num= JOptionPane.showInputDialog("Ingresar cantidad de libros a devolver");
			cant= Integer.parseInt(num);
			stock-=cant;
			prestamos-=cant;
		}
		
		public int dame_stock() {
			
			return stock;
		}

		@Override
		public String toString() {
			return "Libro " + nLibro + ", autor" + autor + ", stock de " + stock + ", prestamos" + prestamos
					+ ", dame_stock()=" + dame_stock() + "";
		}
		
		
		
	
}


