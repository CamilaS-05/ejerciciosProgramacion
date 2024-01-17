package ejer_lampara;

public class main1 {
	public static void main(String[] args) {
		Lámpara bosch = new Lámpara();
		bosch.settipo(bosch.gettipo());
		bosch.setpotencia(bosch.getpotencia());
		bosch.setcolor(bosch.getcolor());

		System.out.println("El tipo de lampara es " + bosch.gettipo());
		System.out.println("Su potencia " + bosch.getpotencia());
		System.out.println("El color " + bosch.getcolor());
	}

}
