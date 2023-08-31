package PyRectangulo;

public class Rectangulo {
	private Coordenada esquina1;
	private Coordenada esquina2;
	public int base;
	public int altura;
	public String color;
	public static int cont = 0;
	public static int cont1 = 1;
	public static int cont2 = 2; 
	
	public void AsignarColor() {
		cont ++;
		if (cont % 3 == 0) 
			this.color = "Rojo"; 
				
		if (cont == cont1) 
			this.color = "Verde";
				
		if (cont == cont2) 
			this.color = "Amarillo";
			
		cont1 =+3;
		cont2 =+3;
	}
	
	public Rectangulo(Coordenada c1, Coordenada c2) {
		this.esquina1 = c1;
		this.esquina2 = c2;
		this.base = 0;
		this.altura = 0;
	}
	
	public Rectangulo(int b, int a) {
		this.base = b;
		this.altura = a;
		esquina1.setX(0);
		esquina1.setY(0);
		esquina2.setX(0);
		esquina2.setY(0);
	}
	
	public int getBase() {
		return this.base;
	}
	
	public void setBase(int b) {
		this.base = b;
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setAltura(int a) {
		this.altura = a;
	}
	
	public Coordenada getEsquina1() {
		return this.esquina1;
	}
	
	public void setEsquina1(Coordenada c) {
		this.esquina1 = c;
	}
	
	public Coordenada getEsquina2() {
		return this.esquina2;
	}
	
	public void setEsquina2(Coordenada c) {
		this.esquina2 = c;
	}
	
	@Override
	public String toString() {
		return "Rectangulo { Color = " + this.color + "Base = " + this.base + "Altura = " + this.altura + "Esquina1 = " + this.esquina1 + ", Esquina2 = " + this.esquina2 + " }";
	}
}
