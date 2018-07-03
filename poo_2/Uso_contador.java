package poo_2;

public class Uso_contador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Contador cont1= new Contador();
		
		cont1.decrementar();
		
		System.out.println(cont1.dime_decremento());
		
		cont1.incrementar();
		System.out.println(cont1.dime_incremento());
		
		cont1.setNum(15);
		cont1.incrementar();
		
		System.out.println(cont1.dime_incremento());
		cont1.decrementar();
		System.out.println(cont1.dime_decremento());
		
		
	}

}
