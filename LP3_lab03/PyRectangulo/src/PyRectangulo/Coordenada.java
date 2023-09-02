package PyRectangulo; 

public class Coordenada { 
	private int x; 
	private int y;  	 
	
	public Coordenada() { 
		this.x = 0; 
		this.y = 0; 
	} 
	
	public Coordenada(int x, int y) { 
		this.x = x; 
		this.y = y; 
	} 
	
	public Coordenada(Coordenada c) {
		this.x = c.x; 
		this.y = c.y; 
	} 
		
	public int getX () { 
		return this.x; 	
	} 
		
	public void setX (int x) { 
		this.x = x; 
	} 
	
	public int getY () { 
		return this.y; 
	} 
	
	public void setY (int y) { 
		this.y = y; 
	} 
	
	public static double distancia (Coordenada c1, Coordenada c2) { 
		double resX; 
		double resY; 
		resX = c2.x - c1.x; 
		resY = c2.y - c1.y; 
		System.out.println("Resultado { x = " + resX + ", y = " + resY + " }"); 
		return 0.0; 
	} 
	 
	@Override 
	public String toString() { 
		return "Coordenada { x = " + this.x + ", y = " + this.y + " }"; 
	} 	 
}