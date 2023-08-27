package PyLab02_eje02;

public class Principal {

	public static void main(String[] args) {
		PerfilMedico pM1 = new PerfilMedico("Luis", "Morales", "M", 12, 4, 1998, 180, 79.3);
		pM1.ObEdad();
		pM1.FCM();
		pM1.IMC();
	}
}
