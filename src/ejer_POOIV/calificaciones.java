package ejer_POOIV;

/*Crea una clase Curso con atributos para el nombre del curso y la calificación. Usa JOptionPane
para permitir al usuario ingresar el nombre del curso y la calificación, y almacénalos usando
setters. Usa un switch case para categorizar la calificación en A, B, C, D, o F y muestra el
resultado.
*/
public class calificaciones { 
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	private String nombre;
	private double calificacion;
	
	public calificaciones() {
		
	}

}
