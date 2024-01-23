package ejer_automovil;

public class main {
	public static void main(String[] args) {
		automovil autoCam = new automovil();

		autoCam.setmarca(autoCam.getmarca());
		autoCam.setmodelo(autoCam.getmodelo());

		System.out.println(autoCam.getmarca());
		System.out.println(autoCam.getmodelo());

	}

}
