package basicos;
import java.util.*;

import javax.swing.JOptionPane;

public class Ej4Generales {
public static void main (String [] args) {
	// TODO Auto-generated method stub
//4. Mostrar la tabla de multiplicar de un n�mero.
	
	
	
	String n= JOptionPane.showInputDialog("Ingrese un n�mero: ");
	
	int num= Integer.parseInt(n);
	
	for(int i=0; i<10;i++) {
		
			System.out.println(num+" x "+i+" = "+(num*i));
		}
	
	
}}
