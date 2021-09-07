package deber.metodos.string;

import java.util.Scanner;

public class MainEstudiante {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner Li = new Scanner(System.in);
	Scanner Ls = new Scanner(System.in); 

	String c, c1; 
	String vector[] = new String[4]; 
	int op; 

	
   do { 
		System.out.println("MENU");
		System.out.println("");
		System.out.println("1.- Ingresar Estudiante.");
		System.out.println("2.- Buscar Estudiante.");
		System.out.println("3.- SALIR.");
	   op = Li.nextInt(); 
	   
   int i = 0; 
	   if (op == 1) { 
		    for( i = 0; i <= 4; i++) {
			System.out.println("Ingresar la cédula del Estudiante: ");
		    c = Ls.nextLine(); 
			vector[i] = c; 
		    }
		    }else if(op == 2) {
				System.out.println("Ingrese cedula del Estudiante a buscar: ");
                c1 = Ls.nextLine();  
			   boolean resultado = vector[i].equals(c1); 
				System.out.println("El estudiante se encuentra en el Vector?"+ resultado);	    
	   }
	   
   }while(op != 3);
	System.out.println("SE SALIO DEL SISTEMA.");

	
	}

}
