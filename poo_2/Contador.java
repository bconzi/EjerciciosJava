package poo_2;
import javax.swing.*;
public class Contador {

	/*2. Crea una clase Contador con los m�todos para incrementar y decrementar el contador. 
	 * La clase contendr� un constructor por defecto, un constructor con par�metros, un constructor copia y los m�todos getters
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
