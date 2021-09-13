package deber.nonaccess;

//La clase no se puede heredar por la clase Padre final
public class JugadoresFutbol extends Jugadores{
	
	//atributo tipo final
	
	  int edad; 
   public final int deportePractica = 0;
	 
		public void tiposJugadores() {
			
			   System.out.println("Deporte a Realizar." +deportePractica); 	 

		}

}
