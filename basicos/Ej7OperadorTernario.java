package basicos;

public class Ej7OperadorTernario {

	public static void main(String[] args) {
		/*7. Programa Java que declare una variable C de tipo entero y as�gnale un valor. 
		 * A continuaci�n muestra un mensaje indicando si el valor de C es positivo o negativo, si es par o impar,
		 *  si es m�ltiplo de 5, si es m�ltiplo de 10 
		 * y si es mayor o menor que 100. Consideraremos el 0 como positivo.
		 *  Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.*/ 

		int c= 20;
		
		System.out.println(c%2==0?+c+" es positivo" :c+" es negativo");
		System.out.println(c%5==0?+c+" es multiplo de 5" :c+" no es m�ltiplo de 5");
		System.out.println(c%10==0?+c+" es multiplo de 10" :c+" no es m�ltiplo de 10");
		System.out.println(c<100?+c+" es menor que 100" :c+" no es menor que 100");
		
		
		
	}

}
