package ejercicios.clase.String;
import java.util.Scanner; 
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1 contains		
		String frase = "Programacion de algoritmos módulo II";	
		Scanner L = new Scanner (System.in); 
		Scanner L2 = new Scanner (System.in); 
		
		System.out.println("Ingrese una palabra: ");
		String p = L.nextLine();
		
		boolean resultado = frase.contains(p); 
		System.out.println("Contiene la palabra? "+ resultado);

		//2 equals
		System.out.println("----------------------------------------------");
		String cadena1 = "Cristian"; 
		System.out.println("Ingrese la segunda cadena: ");
		String cadena2 = L2.nextLine(); 
		resultado = cadena1.equals(cadena2); 
		System.out.println("Las cadenas son iguales? "+ resultado);
		
		//uper y lower
		
		System.out.println("----------------------------------------------");
		String nombre = "juanito"; 
		String nombreEnMayuscula = nombre.toUpperCase(); 
		System.out.println("Nombre en Mayuscula: "+ nombreEnMayuscula);
		
		System.out.println("----------------------------------------------");
		String nombre1 = "JUANITO"; 
		String nombreEnMinuscula = nombre1.toLowerCase(); 
		System.out.println("Nombre en Minuscula: "+ nombreEnMinuscula);	
	}
}
