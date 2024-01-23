package ejer_alarma;

public class main {
	public static void main(String[] args) {
		alarma miReloj = new alarma();
		System.out.println("Hora de Alarma: " + miReloj.getalarma());
		System.out.println("Hora Actual: " + miReloj.gethoraActual());
		System.out.println("Alarma Activada: " + miReloj.alarmaActivada());
		miReloj.comprobarAlarma();
	}
}
