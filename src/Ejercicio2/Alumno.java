package Ejercicio2;

public class Alumno {
	
	private String nombre;
	private int edad;
	
	
	

	public Alumno(String nombre,int edad) {
		this.nombre = nombre;
		this.edad = edad;
		
	}




	public String toString() {
		return "|"+"Nombre: "+nombre+ ", Edad: "+edad+"|";
	}



	
	
}