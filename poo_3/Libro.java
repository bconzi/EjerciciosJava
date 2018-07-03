package poo_3;

import javax.swing.JOptionPane;

public class Libro {


		/*3. Crea una clase Libro con los métodos préstamo, devolución y toString. La clase contendrá un constructor
		 *  por defecto, un constructor con parámetros y los métodos getters y setters.
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
		
		
		public void préstamo () {
			
			String num= JOptionPane.showInputDialog("Ingresar cantidad de libros a prestar");
			cant= Integer.parseInt(num);
			stock-=cant;
			prestamos+=cant;
		}
		 
		public int cuantos_libros_presté() {
			
			
			return prestamos;
			
		}
		

		public void devolución () {
			
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


