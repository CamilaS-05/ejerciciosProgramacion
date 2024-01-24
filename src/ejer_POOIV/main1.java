package ejer_POOIV;

import javax.swing.JOptionPane;

public class main1 {
		 
			public static void main(String[] args) {
				estudiantes esudiante1 = new estudiantes();
				estudiantes esudiante2 = new estudiantes();
				estudiantes esudiante3 = new estudiantes();
				
				esudiante1.setnombre(JOptionPane.showInputDialog("Ingresa el nombre del estudiante 1:"));
				esudiante1.setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante 1:")));
				esudiante1.setgrado(JOptionPane.showInputDialog("Ingresa el grado del estudiante 1:"));
		 
				esudiante2.setnombre(JOptionPane.showInputDialog("Ingresa el nombre del estudiante 2:"));
				esudiante2.setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante 2:")));
				esudiante2.setgrado(JOptionPane.showInputDialog("Ingresa el grado del estudiante 3:"));
		        
				esudiante3.setnombre(JOptionPane.showInputDialog("Ingresa el nombre del estudiante 3:"));
				esudiante3.setedad(Integer.parseInt(JOptionPane.showInputDialog("Ingresa la edad del estudiante 3:")));
				esudiante3.setgrado(JOptionPane.showInputDialog("Ingresa el grado del estudiante 3:"));
		        
		        System.out.println("Información del Estudiante 1:");
		        esudiante1.mostrarInformacion();
		 
		        System.out.println("Información del Estudiante 2:");
		        esudiante2.mostrarInformacion();
		 
		        System.out.println("Información del Estudiante 3:");
		        esudiante3.mostrarInformacion();
			}
		 
		}
