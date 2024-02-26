package POO;

public class coche {
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private String datosGenerales;
	private boolean asientosCuero;

	public coche() {
		ancho = 250;
		largo = 400;
		ruedas = 4;
		motor = 200;
		peso = 1900;

	}

	public int getruedas() {
		return ruedas;
	}

	public int getlargo() {
		return largo;
	}

	public int getancho() {
		return ancho;
	}

	public int getmotor() {
		return motor;
	}

	public int getpeso() {
		return peso;
	}

	public String getdatosGenerales() {
		return "La plataforma del coche tiene " + ruedas + " ruedas" + ". Mide " + largo / 1000
				+ " metros con un ancho de " + ancho + " centímetros y un peso de plataforma de " + peso + " kg. ";
	}
	

	public String asientosCuero() {
		if (asientosCuero) {
			return "El coche tiene asientos de cuero";
		} else {
			return "Tus asientos son de pena";
		}

	}

	public void setruedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public void setlargo(int largo) {
		this.largo = largo;
	}

	public void setancho(int ancho) {
		this.ancho = ancho;
	}

	public void setmotor(int motor) {
		this.motor = motor;
	}

	public void setpeso(int peso) {
		this.peso = peso;
	}

	public void setdatosGenerales(String datosGenerales) {
		this.datosGenerales = datosGenerales;
	}

	public void asientosCuero(boolean asientosCuero) {
		this.asientosCuero = asientosCuero;

	}

	public void configuraAsientos(String asientosCuero) {
		if (asientosCuero == "si") {
			this.asientosCuero = true;
		} else {
			this.asientosCuero = false;
		}
	}
}
