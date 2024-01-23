package ejer_automovil;

public class automovil {
	private String marca;
	private String modelo;

	public automovil() {
		marca = "Ford";
		modelo = "GT-500";
	}

	public String getmarca() {
		return marca;
	}

	public String getmodelo() {
		return modelo;
	}

	public void setmarca(String marca) {
		this.marca = marca;
	}

	public void setmodelo(String modelo) {
		this.modelo = modelo;
	}
}
