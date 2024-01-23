package ejer_POOIV;

import javax.swing.JOptionPane;

public class main2 {

	public static void main(String[] args) {
		salario[] trabajador = new salario[5];
		for (int i = 0; i < 5; i++) {

			String nombre = JOptionPane.showInputDialog("Nombre del empleado");
			double horas = Double.parseDouble(JOptionPane.showInputDialog("Número de horas trabajadas"));
			double tarifa = Double.parseDouble(JOptionPane.showInputDialog("Tarifa por hora"));

			trabajador[i] = new salario(nombre, horas, tarifa);
			JOptionPane.showMessageDialog(null, "Su salario es: " + trabajador[i].CalcularSalario());
                  
		}
	}

}
