package ejer_POOIV;

/*Desarrolla una clase Empleado con atributos para nombre, horas trabajadas y tarifa por hora.
Usa getters y setters para manipular estos atributos. En el archivo principal, usa un bucle for
para ingresar los datos de 5 empleados mediante JOptionPane y calcula su salario (horas
trabajadas * tarifa por hora).*/
public class salario {
	private String nombre;
	private double horas;
	private double tarifa;

	public salario(String nombre, double horas, double tarifa) {
		this.nombre = nombre;
		this.horas = horas;
		this.tarifa = tarifa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getHoras() {
		return horas;
	}

	public void setHoras(double horas) {
		this.horas = horas;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}
	public double CalcularSalario() {
		return  tarifa * horas;
	}
}
