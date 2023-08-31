package PyRectangulo;
import java.util.Scanner;

public class Manejador {
	Scanner sc = new Scanner(System.in);
	
	public Manejador() {}
	
	public void Area(Rectangulo r) {
		double a;
		a = r.base * r.altura;
		System.out.println("El area es " + a);
	}
	
	public void Perimetro(Rectangulo r) {
		double p;
		p = (r.base * 2) + (r.altura * 2);
		System.out.println("El perimetro es " + p);
	}
	
	public void MoverX(Coordenada c) {
		int nuevac;
		System.out.println("Ingrese la nueva coordenada x: ");
		nuevac = sc.nextInt();
		c.setX(nuevac);
	}
	
	public void MoverY(Coordenada c) {
		int nuevac;
		System.out.println("Ingrese la nueva coordenada y: ");
		nuevac = sc.nextInt();
		c.setY(nuevac);
	}
}
