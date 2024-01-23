package ejer_coche2;

import javax.swing.JOptionPane;

public class main4 {
	public static void main(String[] args) {

		coche Subaru = new coche();
	
		Subaru.establece_color(JOptionPane.showInputDialog("Introduce el color"));
		System.out.println(Subaru.dime_color());
		Subaru.configura_asientos(JOptionPane.showInputDialog("Tienes asientos de cuero"));
		System.out.println(Subaru.dime_asientos());
		Subaru.configuraClimatizador(JOptionPane.showInputDialog("Configura climatizador"));
		System.out.println(Subaru.dime_datos_generales());
		System.out.println(Subaru.dime_color());
		Subaru.configura_asientos("si");
		System.out.println(Subaru.dime_asientos());
	}

}
