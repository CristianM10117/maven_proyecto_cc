package ejercicios.clase.String;

public class Estudiante {

private String nombre; 
private String apellido; 
public static String ciudad = "Machachi"; 
public static String parroquia = "Aloag;";

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public static String getCiudad() {
	return ciudad;
}
public static void setCiudad(String ciudad) {
	Estudiante.ciudad = ciudad;
}
public static String getParroquia() {
	return parroquia;
}
public static void setParroquia(String parroquia) {
	Estudiante.parroquia = parroquia;
}



	
	
	
}
