package POO;

public class Uso_Coche {
	public static void main(String[] args) {
		coche Renault = new coche();
		Renault.setruedas(Renault.getruedas());
		Renault.setlargo(Renault.getlargo());
		Renault.setancho(Renault.getancho());
		Renault.setmotor(Renault.getmotor());
		Renault.setpeso(Renault.getpeso());
		Renault.setdatosGenerales(Renault.getdatosGenerales());
		Renault.configuraAsientos("si");
		

		System.out.println("Las ruedas del coche son: " + Renault.getruedas());
		System.out.println("Su largo es: " + Renault.getlargo());
		System.out.println("el ancho que tiene: " + Renault.getancho());
		System.out.println("su motor es de: " + Renault.getmotor());
		System.out.println("pesa: " + Renault.getpeso());
		System.out.println(Renault.getdatosGenerales());
		System.out.println(Renault.asientosCuero());
		

	}

}
