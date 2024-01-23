package ejer_producto;

public class main {
	public static void main(String[] args) {
		producto Pagua = new producto();

		Pagua.setnombre(Pagua.getnombre());
		Pagua.setprecio(Pagua.getprecio());
		Pagua.setstock(Pagua.getstock());

		System.out.println(Pagua.getnombre());
		System.out.println(Pagua.getprecio());
		System.out.println(Pagua.getstock());

	}

}
