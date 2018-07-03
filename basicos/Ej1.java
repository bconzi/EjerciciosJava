package basicos;

public class Ej1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una variable A de tipo double y una variable C de
 *   tipo char y asigna a cada una un valor. A continuación muestra por pantalla: El valor de cada variable, la suma
 *  de N + A, la diferencia de A - N, el valor numérico correspondiente al carácter que contiene la variable C.*/
		
		int n=2;
		double a=3;
		char c= '3';
		
		System.out.println("Valor de cada variable: ");
		System.out.println("-------------------------");
		System.out.println("Valor de n=" +n);
		System.out.println("Valor de a=" +a);
		System.out.println("Valor de c=" +c);
		System.out.println("Suma de n+a=" +(n+a));
		System.out.println("Diferencia de a-n=" +(a-n));
		System.out.println("Valor numérico del carácter " + c + " = " + (int)c);
		
	}

}
