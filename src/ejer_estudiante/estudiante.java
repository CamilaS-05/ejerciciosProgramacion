package ejer_estudiante;

public class estudiante {
	private String nombre;
	private int edad;
	private double calificacion;

	public estudiante() {
		nombre = "Jose";
		edad = 23;
		calificacion = 9.3;
	}

	public String getnombre() {
		return nombre;
	}

	public int getedad() {
		return edad;
	}

	public double getcalificacion() {
		return calificacion;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public void setedad(int edad) {
		this.edad = edad;
	}

	public void setcalificacion(double calificacion) {
		this.calificacion = calificacion;
	}
}
