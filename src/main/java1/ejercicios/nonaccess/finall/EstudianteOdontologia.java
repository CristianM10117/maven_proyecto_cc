package ejercicios.nonaccess.finall;

public class EstudianteOdontologia extends EstudianteMedicina{
	
	//No se puede sobreescribir un metodo final del padre
	protected void realizarPracticas() {
		
		System.out.println("Realiza 100 horas de práticas");
	}

	protected void realizarPasantias () {
		System.out.println("Realiza 200 horas de pasantias");
	}


}
