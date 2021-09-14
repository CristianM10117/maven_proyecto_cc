package proyecto.prueba;

import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner Ls = new Scanner (System.in); 
Scanner Li = new Scanner (System.in);
     String c; 

	do {
		
		System.out.println("Ingresar clave");
		 c = Ls.nextLine(); 
		
		if(c == "85DB") {
			
			System.out.println("1.- Consultar pagos. ");
			System.out.println("2.- Relizar transferencia. ");
			System.out.println("3.- SALIR. ");
            int op = Li.nextInt(); 
            
            if(op == 1) {
            	
    			System.out.println("No tiene ningun pago pendiente. ");

            }else if (op == 2) {
    			System.out.println("Ingrese la cuenta de destino: ");
    			int cuenta = Li.nextInt(); 
    			System.out.println("Ingrese monto a transferir: ");
	            int monto = Li.nextInt(); 
	            if(monto > 2500) {
	    			System.out.println("No contiene ese monto.");
	            }else {
	    			int r = 2500 - monto; 
    			System.out.println("Su nuevo saldo es: " +r);
	            }
    		 
            }else if (op == 3) {
            	System.out.println("Ingresar clave");
        	    c = Ls.nextLine();
            }

		}else {
			System.out.println("clave incorrecta.");
			System.out.println("Ingresar clave: ");
		    c = Ls.nextLine();
		}
	
	}while(c != "-1"); 
	
	System.out.println("Gracias por preferirnos.");

	}
}

