package prueba;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Ls = new Scanner (System.in); 
		Scanner Li = new Scanner (System.in); 
		String c;
		String op; 
		int saldoInicial = 2500; 
		
		do {
		System.out.println("Ingresar clave");
	    c = Ls.nextLine(); 
	    
		if(c.equals("85DB")) {
			do {
			System.out.println("BANCO PICHINCHA, elija una opción: ");
			System.out.println("1.- Consultar pagos. ");
			System.out.println("2.- Relizar transferencia. ");
			System.out.println("3.- SALIR. ");
		    op = Ls.nextLine();
		    if(op.equals("1")) {
		    System.out.println("No tiene ningún pago pendiente. ");
		    
		    }else if(op.equals("2")) {
		    	System.out.println("Ingrese la cuenta de destino: ");
		    	String destino = Ls.nextLine(); 
		    	System.out.println("Ingrese el monto a transferir: ");
		    	int monto = Li.nextInt();
		    	
		    	saldoInicial = saldoInicial - monto; 
		    	System.out.println("Nuevo saldo es: " +saldoInicial);
		    }
			}while(!op.equals("3"));
			c = "0";
		}else {
			System.out.println("La clave no es la correcta.");
		}
		}while(c.equals("-1"));
		System.out.println("Gracias por preferirnos.");
	}    

}
