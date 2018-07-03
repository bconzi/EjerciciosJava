package basicos;
 import java.util.*;
 

import javax.swing.JOptionPane;
public class Ej1Condicional {
	
	public static void main(String[] args) {

//1. Programa Java que lea un número entero y calcule si es par o impar.
	
	String num =JOptionPane.showInputDialog("Ingrese un número ");
	
	String num2 =JOptionPane.showInputDialog("Ingrese un número ");
	
	int numero1= Integer.parseInt(num);
	int numero2= Integer.parseInt(num2);
	
	int suma=numero1+numero2;
	
	String s=String.valueOf(suma);
	
	if (suma %2==0) {

		
		//JOptionPane.showInputDialog("La suma "+String.valueOf(suma)+"es par");
		
		JOptionPane.showMessageDialog(null, "La suma "+s+" es par");
	}
	else {
		JOptionPane.showMessageDialog(null,"La suma "+s+" no es par");
	}
	}
}