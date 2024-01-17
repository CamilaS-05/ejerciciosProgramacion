package ejer_lampara;

public class Lámpara {
	private String tipo;
	private int potencia;
	private String color;

	public Lámpara() {
		tipo = "LED";
		potencia = 60;
		color = "blanco";

	}

	public int getpotencia() {
		return potencia;
	}

	public String gettipo() {
		return tipo;
	}

	public String getcolor() {
		return color;
	}

	public void setpotencia(int potencia) {
		this.potencia = potencia;
	}

	public void settipo(String tipo) {
		this.tipo = tipo;
	}

	public void setcolor(String color) {
		this.color = color;
	}
}
