package ejer_cuentaBancaria;

public class CuentaBancaria {
	private String titular;
	private double saldo;

	public CuentaBancaria() {
		titular = "Camila";
		saldo = 3000.85;
	}

	public String titular() {
		return titular;
	}

	public double saldo() {
		return saldo;
	}

	public void settitular(String titular) {
		this.titular = titular;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
	}
}
