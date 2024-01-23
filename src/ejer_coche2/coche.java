package ejer_coche2;

public class coche {

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;

	public boolean climatizador() {
		return climatizador;
	}

	public String dime_climatizador() {
		if (climatizador == true) {
			return "tienes climatizador";
		} else {
			return "no tienes climatizador";
		}
	}

	public void configuraClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("Sí")) {
			this.climatizador = true;

		} else {
			this.climatizador = false;
		}

	}

	public coche() {
		ancho = 2500;
		largo = 4000;
		ruedas = 4;
		motor = 200;
		peso_plataforma = 1900;

	}

	public String dime_motor() {// GETTER

		return "El motor del coche tiene " + motor + " caballos de potencia";

	}

	public void establece_color(String color_coche) {

		color = color_coche;
	}

	public String dime_color() { // GETTER
		return "El color de tu coche es " + color;
	}

	public String dime_datos_generales() {
		return "La plataforma del coche tiene " + ruedas + " ruedas" + ". Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " centímetros y un peso de plataforma de " + peso_plataforma
				+ " kg";
	}

	public void configura_asientos(String asientos_cuero) {// SETTER
		if (asientos_cuero == "si") {

			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}

	}

	public String dime_asientos() {
		if (asientos_cuero) {

			return "El coche tiene asientos de cuero";

		} else {
			return "Tus asientos son de pena.";
		}

	}

	public String dime_peso_coche() {
		int pesoCarrocería = 500;
		peso_total = peso_plataforma + pesoCarrocería;

		if (asientos_cuero == true) {
			peso_total = peso_total + 50;

		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso del cocge es " + peso_total;
	}

	public int precio_coche() {
		int precio_final = 10000;
		if (asientos_cuero == true) {
			precio_final += 2000;
		}
		if (climatizador == true) {
			precio_final += 1500;
		}
		return precio_final;
	}
}
