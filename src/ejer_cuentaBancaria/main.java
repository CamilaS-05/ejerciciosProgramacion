package ejer_cuentaBancaria;

public class main {
	public static void main(String[] args) {
		CuentaBancaria cuentaCam = new CuentaBancaria();

		cuentaCam.settitular(cuentaCam.titular());
		cuentaCam.setsaldo(cuentaCam.saldo());
		
		System.out.println(cuentaCam.titular());
		System.out.println(cuentaCam.saldo());

	}
}

