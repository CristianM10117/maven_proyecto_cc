package deber.ordenamiento.vectores;
import java.util.Arrays;
import java.util.Scanner; 
public class MainOrdenamiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Li = new Scanner(System.in);
		Scanner Ls = new Scanner(System.in);
		
		String nombre; 
		String apellido; 
		int edad; 
		int op;
		String sintoma;
	
		
		System.out.println("Ingrese límite de Vector: ");
		int n = Li.nextInt(); 
		
		Paciente vector[] = new Paciente[n];  
		
		do {
		
		System.out.println("1.- Registrar paciente. ");
		System.out.println("2.- Imprimir reporte. ");
		System.out.println("3.- SALIR. ");
		op = Li.nextInt(); 
	
		if(op == 1) {
		for (int i = 0; i <= n; i++) {
			
		System.out.println("Ingrese el nombre: ");
		nombre = Ls.nextLine();
		System.out.println("Ingrese el apellido: ");
		apellido = Ls.nextLine();
		System.out.println("Ingrese la edad: ");
		edad = Li.nextInt();
		System.out.println("Ingrese el sintoma: ");
		sintoma = Ls.nextLine();

		Paciente pacientex = new Paciente(); 
	    pacientex.setNombre(nombre);
	    pacientex.setApellido(apellido);
	    pacientex.setEdad(edad);
	    pacientex.setSintoma(sintoma);
		   
	    vector[i] = pacientex; 
	    
		}
		}else if (op == 2) {
			Arrays.sort(vector);
			System.out.println("ordenados por edad. ");
			System.out.println(Arrays.toString(vector));
		}

}while(op != 3); 
}
}
