package poo_2;
import javax.swing.*;
public class Contador {

	/*2. Crea una clase Contador con los métodos para incrementar y decrementar el contador. 
	 * La clase contendrá un constructor por defecto, un constructor con parámetros, un constructor copia y los métodos getters
	 *  y setters.*/
	private int num;
	
	public Contador () {
		
	}
	
	public Contador (int num) {
		this.num=num;
	}
	
	public void incrementar() {
		
		String num1= JOptionPane.showInputDialog("Ingresar numero a incrementar: ");
		
		num= Integer.parseInt(num1);
		
	    num++;
	}
	
	public int dime_incremento() {
		
		return num;
	}
	

	
	public void decrementar() {
		
		String num1= JOptionPane.showInputDialog("Ingresar numero a decrementar: ");
		
		num= Integer.parseInt(num1);
		
	    num--;
	}
	
public int dime_decremento() {
		
		return num;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	
	
}
