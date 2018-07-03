package poo_1;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

public class Cuenta   {
	
	/*1. Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia. La clase contendrá un constructor 
	 * por defecto, un constructor con parámetros, un constructor copia y los métodos getters y setters.*/

	private String nombre;
	private String numeroCuenta;
	private double valor;
	private double saldo;



	//constructor con parámetros
	
	public Cuenta(String nombre, String numeroCuenta, double saldo){
	
		 this.nombre = nombre;
	        this.numeroCuenta = numeroCuenta;
	            this.saldo = saldo;

		
	}
	

    //Constructor copia
    public Cuenta(final Cuenta c) {
        nombre = c.nombre;
            numeroCuenta = c.numeroCuenta;
               saldo = c.saldo;
    }

	public double ingresoDinero(double valor) {
	      	
		if (valor<=0) {
			System.out.println("Debe ingresar un valor mayor a 0");
			
		}
		else {
       		saldo= saldo+valor;
       		
       		}
		return saldo;
		
	}
	
	/*1. Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia. La clase contendrá un constructor 
	 * por defecto, un constructor con parámetros, un constructor copia y los métodos getters y setters.*/	
	
	public double reintegro(double valor) {
		
				
		if (valor<=0) {
			System.out.println("Debe ingresar un valor mayor a 0");
			
		}
		else {
       		saldo= saldo+valor;
       		
       		}
		return saldo;	
	}
	
	public double transferencia (double valor) {
		
		if (valor<=0) {
			System.out.println("Debe ingresar un valor mayor a 0");
			
		}
		else if (saldo<valor) {
			System.out.println("No tienes suficiente dinero en la cuenta para esta transferencia");
			
		}
		else {
       		saldo= saldo-valor;
       		
       		}
		return saldo;
	}
	
public double retiro (double valor) {
		
		if (valor<=0&&saldo>0) {
			System.out.println("Debe ingresar un valor mayor a 0");
			
		}
		else {
       		saldo= saldo-valor;
       		
       		}
		return saldo;
	}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getNumeroCuenta() {
	return numeroCuenta;
}


public void setNumeroCuenta(String numeroCuenta) {
	this.numeroCuenta = numeroCuenta;
}


public double getValor() {
	return valor;
}


public void setValor(double valor) {
	this.valor = valor;
}


public double getSaldo() {
	return saldo;
}


public void setSaldo(double saldo) {
	this.saldo = saldo;
}


@Override
public String toString() {
	return "Cuenta " + numeroCuenta +", titular, "+nombre + ", saldo = $" + saldo;
}







	
	
	
}
