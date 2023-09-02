package PyRectangulo;

public class Rectangulo {
	private Coordenada esquina1; 
    private Coordenada esquina2; 
    public int base; 
    public int altura; 
    public String color; 
    public static String[] colores = { "Verde", "Amarillo", "Rojo" }; 
    public static int ultiColorIndex = -1; 
  
    public Rectangulo(Coordenada c1, Coordenada c2) { 
        this.esquina1 = c1; 
        this.esquina2 = c2; 
        this.base = 0; 
        this.altura = 0; 
        this.AsignarColor(); 
    } 

    public Rectangulo(int b, int a) { 
        this.base = b; 
        this.altura = a; 
        this.esquina1 = new Coordenada(0, 0); 
        this.esquina2 = new Coordenada(b, a); 
        this.AsignarColor(); 
    } 

    public void AsignarColor() { 
        ultiColorIndex = (ultiColorIndex + 1) % colores.length; 
        this.color = colores[ultiColorIndex]; 
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
		return "Rectangulo { Color = " + this.color + ", Base = " + this.base + ", Altura = " + this.altura + ", Esquina1 = " + this.esquina1 + ", Esquina2 = " + this.esquina2 + " }"; 
	}
}
