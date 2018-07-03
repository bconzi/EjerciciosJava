package poo_1;


public class Cuenta_test_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
	
		
		Cuenta cuenta1 = new Cuenta ("Marcos Alvarez", "123456",0 );
		
		

		
		
		cuenta1.ingresoDinero(1000);
		
		System.out.println("Marcos Alvarez, su saldo es de: $"+cuenta1.getSaldo());
		cuenta1.ingresoDinero(2500);
			
		
		cuenta1.transferencia(300);
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.reintegro(50);
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.ingresoDinero(100);
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.retiro(3350);
		System.out.println(cuenta1.getSaldo());
		
		cuenta1.transferencia(100);
		
		cuenta1.setSaldo(500);
		System.out.println(cuenta1.getSaldo());
		
		
		Cuenta cuenta2 = new Cuenta(cuenta1);
		
		System.out.println(cuenta2.getSaldo()+cuenta2.getNombre());
		
		System.out.println(cuenta1.toString());
		
	}

}
