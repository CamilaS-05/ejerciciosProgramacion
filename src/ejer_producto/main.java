package ejer_producto;

public class main {
	public static void main(String[] args) {
		producto Pagua = new producto();

		Pagua.setnombre(Pagua.nombre());
		Pagua.setprecio(Pagua.precio());
		Pagua.setstock(Pagua.stock());

		System.out.println(Pagua.nombre());
		System.out.println(Pagua.precio());
		System.out.println(Pagua.stock());

	}

}
