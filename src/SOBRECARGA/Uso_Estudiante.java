package SOBRECARGA;

public class Uso_Estudiante {
	public static void main(String[] args) {

		Estudiante alumno1 = new Estudiante("Jose", " ", 20, 10);
		Estudiante alumno2 = new Estudiante("Carlos", 20, 7);

		System.out.println("Estudiante : " + alumno1.getNombre() + "\n" + "Edad : " + alumno1.getEdad() + "\n"
				+ "Promedio : " + alumno1.getPromedio() + "\n" + "Logro : " + alumno1.getLogro());
		System.out.println();
		System.out.println("Estudiante : " + alumno2.getNombre() + "\n" + "Edad : " + alumno2.getEdad() + "\n"
				+ "Promedio : " + alumno2.getPromedio() + "\n" + "Logro : " + alumno2.getLogro());
	}
}
