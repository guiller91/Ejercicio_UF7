
import instituto.*;

public class Main {

	public static void main(String[] args) {

		int nota = 0;
		double media;
		Alumno alumno1 = new Alumno("Guillermo Perez", 101000);
		
		//Asignar notas
		alumno1.calificar("Lengua", 10);
		alumno1.calificar("Sociales", 8);
		alumno1.calificar("Programacion", 7);
		alumno1.calificar("Mates", 10);
		alumno1.calificar("BBDD", 7);
		alumno1.calificar("Entornos", 6);

		
		//Imprimir el toString de Alumno
		System.out.println(alumno1);
		
		//Bucle para sacar asignatura + nota
		for (int i = 0; i < alumno1.getCalificaciones().size(); i++) {
			System.out.println(alumno1.getCalificaciones(i));
			nota += alumno1.getCalificaciones(i).getNota();
		}

		//Calculo de la media usando la cantidad de datos del arraylist
		media = nota / alumno1.getCalificaciones().size();
		System.out.println("NOTA MEDIA: "+ media);
		

	}

}
