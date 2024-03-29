package POOV;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

public class Empleados {
	public Empleados(String nombre, double sueldo, int año, int mes, int dia) {

	}

	public static void main(String[] args) throws ParseException {

		fechaContrato empleado3 = new fechaContrato("Empleado 3", "2020-12-30");
		fechaContrato empleado4 = new fechaContrato("Empleado 4", "2010-12-24");

		if (empleado3.getFecontrato().getTime() < empleado4.getFecontrato().getTime()) {
			JOptionPane.showMessageDialog(null, empleado3.getNombre() + " fue contrado primero.");
		}

		else if (empleado3.getFecontrato().getTime() > empleado4.getFecontrato().getTime()) {
			JOptionPane.showMessageDialog(null, empleado4.getNombre() + " fue contrado primero.");
		}

		else {
			JOptionPane.showMessageDialog(null, "Fechas iguales...");
		}
	}

	public int getAlta_contrato() {

		return 0;
	}

	public String getNombre() {

		return null;
	}

	public String getSueldo() {

		return null;
	}

}

class fechaContrato {

	private String nombre;
	private Date fecontrato;

	public fechaContrato(String nombre, String fecontrato) throws ParseException {
		this.nombre = nombre;
		SimpleDateFormat fechas = new SimpleDateFormat("yyyy-mm-dd");
		this.fecontrato = fechas.parse(fecontrato);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecontrato() {
		return fecontrato;
	}

	public void setFecontrato(Date fecontrato) {
		this.fecontrato = fecontrato;
	}

}
