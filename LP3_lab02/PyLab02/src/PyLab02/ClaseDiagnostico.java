package PyLab02;

public class ClaseDiagnostico {	
	public ClaseDiagnostico() {}

	public void AptoVacunaA(ClasePerro p) {
		if ((p.getTemp() >= 37 && p.getTemp() <= 40) && p.getPeso() > 5 && p.getEdad() > 1)
			System.out.println("El perro esta sano. Apto para la vacunaA");
		else
			System.out.println("El perro esta enfermo.");
	}
	
	public void AptoVacunaB(ClasePerro p) {
		if ((p.getTemp() >= 37 && p.getTemp() <= 40) && p.getPeso() > 5 && p.getEdad() > 1)
			System.out.println("El perro esta sano. Apto para la vacunaB");
		else
			System.out.println("El perro esta enfermo.");
	}
}