package ejercicios.seleccion.switchs;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner L = new Scanner(System.in);
	
	String op; 
	
	do {
		System.out.println("Escoja opción: ");
		System.out.println("1.- Realizar Transferencia ");
		System.out.println("2.- Consultar pagos ");
		System.out.println("3,. SALIR ");
		op = L.nextLine();
		
		switch(op) {
		case "1": 
			System.out.println("Ingrese numero de cuenta: ");
		break;
		
		case "2": 
			System.out.println("INo existen pagos ");
		break;
		case "3": 
			System.out.println("Cerrando el sistema ");
		break;
		default:
			System.out.println("No ha elegido ninguna opcion valida. ");
		}
	}while(!op.equals("3"));
	System.out.println("Gracias por preferirnos");
	}
}