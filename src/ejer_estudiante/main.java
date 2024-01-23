package ejer_estudiante;

public class main {
	public static void main(String[] args) {
		estudiante Ecam = new estudiante();

		Ecam.setnombre(Ecam.getnombre());
		Ecam.setedad(Ecam.getedad());
		Ecam.setcalificacion(Ecam.getcalificacion());

		System.out.println(Ecam.getnombre());
		System.out.println(ECam.getedad());
		System.out.println(ECam.getcalificacion());

	}
}
