package ejer_hotel;

public class hotel {

	private int numeroHabitacion;
	private String tipo;
	private boolean ocupada;

	public hotel(int numeroHabitacion, String tipo) {
		this.numeroHabitacion = numeroHabitacion;
		this.tipo = tipo;
		this.ocupada = false;
	}

	public int getnumeroHabitacion() {
		return numeroHabitacion;
	}

	public String gettipo() {
		return tipo;
	}

	public boolean estaOcupada() {
		return ocupada;
	}

	public void reservar() {
		ocupada = true;
		System.out.println("Habitación " + numeroHabitacion + " reservada.");
	}

	public void cancelarReserva() {
		ocupada = false;
		System.out.println("Reserva de habitación " + numeroHabitacion + " cancelada.");
	}
}

class Hotel {
	private hotel[] habitaciones;

	public Hotel(int numHabitaciones) {
		habitaciones = new hotel[numHabitaciones];
		for (int i = 0; i < numHabitaciones; i++) {
			habitaciones[i] = new hotel(i + 1, "Simple");
		}
	}

	public void mostrarDisponibilidad() {
		System.out.println("Disponibilidad de habitaciones:");

		for (hotel habitacion : habitaciones) {
			String estado = habitacion.estaOcupada() ? "Ocupada" : "Disponible";
			System.out.println("Habitación " + habitacion.getnumeroHabitacion() + ": " + estado);
		}
	}

	public void reservarHabitacion(int numeroHabitacion) {
		if (numeroHabitacion >= 1 && numeroHabitacion <= habitaciones.length) {
			if (!habitaciones[numeroHabitacion - 1].estaOcupada()) {
				habitaciones[numeroHabitacion - 1].reservar();
			} else {
				System.out.println("La habitación " + numeroHabitacion + " ya está ocupada.");
			}
		} else {
			System.out.println("Número de habitación no válido.");
		}
	}

	public void cancelarReserva(int numeroHabitacion) {
		if (numeroHabitacion >= 1 && numeroHabitacion <= habitaciones.length) {
			if (habitaciones[numeroHabitacion - 1].estaOcupada()) {
				habitaciones[numeroHabitacion - 1].cancelarReserva();
			} else {
				System.out.println("La habitación " + numeroHabitacion + " no está ocupada.");
			}
		} else {
			System.out.println("Número de habitación no válido.");
		}
	}
}
