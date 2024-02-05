package Ejercicio2;


public class Start {

	public static void main(String[] args) {
		
		Aula aula = new Aula(4);
		
		Alumno alumno1 = new Alumno("Diego",19);
		Alumno alumno2 = new Alumno("Lorena",20);
		Alumno alumno3 = new Alumno("Paula",24);
		Alumno alumno4 = new Alumno("Pablo",25);
		Alumno alumno5 = new Alumno("Laura",30);
		
		aula.addAlumnos(alumno1);
		aula.addAlumnos(alumno2);
		aula.addAlumnos(alumno3);
		aula.addAlumnos(alumno4);
		
		
		
		System.out.println(aula);
	}

}
