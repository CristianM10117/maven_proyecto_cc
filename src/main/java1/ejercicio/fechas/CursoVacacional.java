package ejercicio.fechas;

import java.time.LocalDate;

public class CursoVacacional {
private String nombre; 
private LocalDate fechaInicio; 
private LocalDate fechaFin;

String getNombre() {
	return nombre;
}
void setNombre(String nombre) {
	this.nombre = nombre;
}
LocalDate getFechaInicio() {
	return fechaInicio;
}
void setFechaInicio(LocalDate fechaInicio) {
	this.fechaInicio = fechaInicio;
}
LocalDate getFechaFin() {
	return fechaFin;
}
void setFechaFin(LocalDate fechaFin) {
	this.fechaFin = fechaFin;
} 


}
