package basicos;
import java.util.*;
import javax.swing.*;
public class Ej2ShowInputDialog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*2. Programa Java que lea un nombre y muestre por pantalla: “Buenos dias nombre_introducido”.*/
		
		String s= JOptionPane.showInputDialog ("Ingrese su nombre");
	
	    		
		System.out.println("Buen dia "+s);
		
		  Scanner sc = new Scanner(System.in);
	        String cadena;
	        System.out.println("Introduce un nombre: ");
	        cadena = sc.nextLine();
	        System.out.println("Buenos Días " + cadena);

	}

}
