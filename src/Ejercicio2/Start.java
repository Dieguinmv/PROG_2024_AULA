package Ejercicio2;


public class Start {

	public static void main(String[] args) {
		
		Aula aula = new Aula(4);
		
		Alumno alumno1 = new Alumno();
		alumno1.setNombre("Diego");
		alumno1.setEdad(19);
		Alumno alumno2 = new Alumno();
		alumno2.setNombre("Lorena");
		alumno2.setEdad(20);
		Alumno alumno3 = new Alumno();
		alumno3.setNombre("Paula");
		alumno3.setEdad(24);
		Alumno alumno4 = new Alumno();
		alumno4.setNombre("Pablo");
		alumno4.setEdad(25);
		Alumno alumno5 = new Alumno();
		alumno5.setNombre("Laura");
		alumno5.setEdad(30);
		
		aula.addAlumnos(alumno1);
		aula.addAlumnos(alumno2);
		aula.addAlumnos(alumno3);
		aula.addAlumnos(alumno4);
		
		
		
		System.out.println(aula);
	}

}
