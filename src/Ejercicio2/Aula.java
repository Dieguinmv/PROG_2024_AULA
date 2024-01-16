package Ejercicio2;

import java.util.Arrays;

public class Aula {
	
	private Alumno alumnos[];
	private int capacidad;
	private int contadorAlumnos;
	
	Aula(int capacidad){
		this.capacidad = capacidad;
		alumnos = new Alumno[capacidad];
		this.contadorAlumnos = 0;
	}

	public void addAlumnos(Alumno alumno) {
			
		if(contadorAlumnos<capacidad) {
			alumnos[contadorAlumnos]= alumno;
			contadorAlumnos++;
			
		}
			
	}

	
	
	public String toString() {
		return Arrays.toString(alumnos);	
	}
}
