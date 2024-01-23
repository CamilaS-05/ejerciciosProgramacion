package ejer_cuentaBancaria;

public class main {
	public static void main(String[] args) {
		CuentaBancaria cuentaCam = new CuentaBancaria();

		cuentaCam.settitular(cuentaCam.gettitular());
		cuentaCam.setsaldo(cuentaCam.getsaldo());
		
		System.out.println(cuentaCam.gettitular());
		System.out.println(cuentaCam.getsaldo());

	}
}
}
