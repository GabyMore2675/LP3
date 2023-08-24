package PyLab02;

public class ClaseDiagnostico {
	ClasePerro p1 = new ClasePerro();
	
	public ClaseDiagnostico(ClasePerro p1) {}
	
	public void AptoVacunaA(double t, double p, int e) {
		t = p1.getTemp();
		p = p1.getPeso();
		e = p1.getEdad();
		if ((t >= 37 || t <= 40) && p > 5 && e > 1)
			System.out.println("El perro esta sano. Apto para la vacunaA");
		else
			System.out.println("El perro esta enfermo.");
	}
	
	public void AptoVacunaB(double t, double p, int e) {
		t = p1.getTemp();
		p = p1.getPeso();
		e = p1.getEdad();
		if ((t >= 37 || t <= 40) && p > 5 && e > 1)
			System.out.println("El perro esta sano. Apto para la vacunaB");
		else
			System.out.println("El perro esta enfermo.");
	}
}
