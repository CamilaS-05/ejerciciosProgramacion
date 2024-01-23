package ejer_POOIV;

/*Crea una clase Estudiante con atributos como nombre, edad y grado. Implementa métodos
getter y setter para cada atributo. En el archivo principal, utiliza JOptionPane para ingresar los
datos de 3 estudiantes y muestra la información de cada uno utilizando los getters.
*/

public class estudiantes {
	private String nombre;
	private int edad;
	private String grado;

	public estudiantes() {

	}

	public String getnombre() {
		return "el nombre del alumno es" + nombre;
	}

	public String getedad() {
		return "su edad es" + edad;
	}

	public String getgrado() {
		return "el nombre del alumno es" + nombre;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public void setedad(int edad) {
		this.edad = edad;
	}

	public void setgrado(String grado) {
		this.grado = grado;
	}

	public void mostrarInformacion() {
		System.out.println("el nombre del estudiante es: " + nombre);
		System.out.println("su edad es: " + edad);
		System.out.println("y esta en: " + grado);

	}

}