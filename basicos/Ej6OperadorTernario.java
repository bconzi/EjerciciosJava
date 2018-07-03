package basicos;

public class Ej6OperadorTernario {

	public static void main(String[] args) {
		/*6. Programa Java que declare una variable B de tipo entero y asígnale un valor. A continuación
		 *  muestra un mensaje indicando si el valor de B es positivo o negativo. Consideraremos el 
		 *  0 como positivo. 
		 * Utiliza el operador condicional (? : ) dentro del println para resolverlo.*/

		
		int B=6;
		System.out.println(B+ (B%2==0 ?" Es par" :"Es impar"));
		
	}

}
