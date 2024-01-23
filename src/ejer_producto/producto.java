package ejer_producto;

public class producto {
	String nombre;
	double precio;
	int stock;

	public producto() {
		nombre = "FuenteLiviana";
		precio = 1.00;
		stock = 80;
	}

	public String nombre() {
		return nombre;
	}

	public double precio() {
		return precio;
	}

	public int stock() {
		return stock;
	}

	public void setnombre(String nombre) {
		this.nombre = nombre;
	}

	public void setprecio(double precio) {
		this.precio = precio;
	}

	public void setstock(int stock) {
		this.stock = stock;
	}

}
