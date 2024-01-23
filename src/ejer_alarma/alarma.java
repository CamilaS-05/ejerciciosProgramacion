package ejer_alarma;

import java.util.Scanner;

public class alarma {

	private String alarma;
	private String horaActual;
	private boolean alarmaActivada;

	public alarma() {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Introduce la hora de alarma (formato HH:mm): ");
		String nuevaHoraAlarma = scanner.next();
		this.alarma = nuevaHoraAlarma;

		System.out.print("Introduce la hora actual (formato HH:mm): ");
		String nuevaHoraActual = scanner.next();
		this.horaActual = nuevaHoraActual;

		this.alarmaActivada = true;

		scanner.close();
	}

	public String getalarma() {
		return alarma;
	}

	public String gethoraActual() {
		return horaActual;
	}

	public boolean alarmaActivada() {
		return alarmaActivada;
	}

	public void setalarma(String nuevaHoraAlarma) {
		this.alarma = nuevaHoraAlarma;
	}

	public void sethoraActual(String nuevaHoraActual) {
		this.horaActual = nuevaHoraActual;
	}

	public void setalarmaActivada(boolean alarmaActivada) {
		this.alarmaActivada = alarmaActivada;
	}

	public void comprobarAlarma() {
		if (horaActual.equals(alarma) && alarmaActivada) {
			System.out.println("¡Venga bro, es hora de levantarte!");
		} else {
			System.out.println("Todavía tienes tiempo de dormir crack, la alarma no ha sonado.");
		}
	}
}
