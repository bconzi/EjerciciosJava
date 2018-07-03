package basicos;
import java.util.*;

import javax.swing.JOptionPane;
public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. Calcular la media de una serie de números que se leen por teclado.
		
       // Scanner k= new Scanner (System.in);
		int[] num = new int [4] ;

		int cont =0;

		
		for (int i=0;i<num.length;i++) {

			String s= JOptionPane.showInputDialog("Ingrese un número: ");
			//System.out.println("Ingrese un número: ");
			//num[i]=k.nextInt();
	
			num[i]= Integer.parseInt(s);
			
			cont= cont+num[i];
			
		}
		
		int	media= cont/4;
		
		//System.out.println("Media es "+media);
		
		String m= String.valueOf(media);
		JOptionPane.showMessageDialog(null, "Media: "+m);		
	}

	

	
}
