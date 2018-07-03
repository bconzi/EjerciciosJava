package basicos;
import java.util.*;
public class Ej4Arrays {

	public static void main (String []args) {
	// TODO Auto-generated method stub

	
	//4. Guardar en un array los 20 primeros números pares
	
	Scanner k= new Scanner (System.in);
	int [] num = new int [10];
	int [] par= new int [10];;
	
	
	for (int i=0; i<num.length; i++) {
		
		System.out.println("Ingresar num ");
		num [i]= k.nextInt();
	    
		if(num[i]%2==0) {
			
			par [i] =num[i];
		}
	}
	
	for (int i=0; i<num.length; i++) {
		if(par[i]>0) {
			
		System.out.print(par[i]+ ",");
		
		}
	}
	
	for (int i=0; i<num.length; i++) {
		if(par[i]>0) {
			
		System.out.print(par[i]+ ",");
		
		}
	}
	 
	 
		
		
	
	
	
		
	
		
		
	
}
}
