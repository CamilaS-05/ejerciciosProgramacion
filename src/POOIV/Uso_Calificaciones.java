package POOIV;

import javax.swing.JOptionPane;

public class Uso_Calificaciones {
public static void main(String[] args) {
		
		String nomCurso = JOptionPane.showInputDialog("Curso : ");
		double calificacion = Double.parseDouble(JOptionPane.showInputDialog("Dime tu nota : "));
		
		Calificaciones notas = new Calificaciones(nomCurso, calificacion);
		
		String nota = notas.Categorizar();
		JOptionPane.showMessageDialog(null, "Tu calificacion del curso " + notas.getNomCurso() + " es " + nota);
		
	}
}
