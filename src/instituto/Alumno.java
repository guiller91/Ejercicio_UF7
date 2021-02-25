package instituto;

import java.util.ArrayList;

public class Alumno {

	private String nombre;
	private int matricula;
	private ArrayList<Calificacion> calificaciones;

	public Alumno(String nombre, int matricula) {

		this.nombre = nombre;
		this.matricula = matricula;
		calificaciones = new ArrayList<Calificacion>();

	}

	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Calificacion getCalificaciones(int i) {
		return calificaciones.get(i);
	}
	public ArrayList<Calificacion> getCalificaciones() {
		return calificaciones;
	}

	
	
	
	
	
	public void calificar(String asignatura, int nota) {		
		 calificaciones.add(new Calificacion(asignatura, nota));
	}

	
	
	
	
	@Override
	public String toString() {
		return "Alumno matricula: " + matricula + " - " + nombre ;

	}

}
