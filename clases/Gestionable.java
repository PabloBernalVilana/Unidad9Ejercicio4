package ejercicio4.clases;

// Clase Abstracta Padre de Alumno y Profesor
public abstract class Gestionable {
	protected String Nombre;
	protected int Edad;
	protected char Sexo;

	// Constructor con todos los Atributos
	public Gestionable(String nombre, int edad, char sexo) {
		Nombre = nombre;
		Edad = edad;
		Sexo = sexo;
	}

	// Metodo para controlar asistencia
	public abstract void controlAsistencia();

}
