package PyRectangulo;

public class Principal {
	public static void main(String[] args) {
		Coordenada co1 = new Coordenada(); 
	    Coordenada co2 = new Coordenada(); 
	        
	    Rectangulo re1 = new Rectangulo(co1, co2); 
	    Rectangulo re2 = new Rectangulo(43, 68); 
	    Rectangulo re3 = new Rectangulo(co1, co2); 
	    Rectangulo re4 = new Rectangulo(12, 27);       
	    Manejador ma1 = new Manejador(); 

	    re1.setBase(12); 
	    re1.setAltura(10); 

	    ma1.Area(re1); 
	    ma1.Perimetro(re1); 
	    ma1.Area(re2); 
	    ma1.Perimetro(re2);
        
	    ma1.MoverX(co1); 
	    ma1.MoverY(co1); 
	    ma1.MoverX(co2); 
	    ma1.MoverY(co2); 

	    System.out.println("===============================================================Rectangulo 01===============================================================\n"); 
	    System.out.println(re1.toString()); 
	    System.out.println("\n===============================================================Rectangulo 02===============================================================\n"); 
	    System.out.println(re2.toString()); 
	    System.out.println("\n===============================================================Rectangulo 03===============================================================\n"); 
	    System.out.println(re3.toString()); 
	    System.out.println("\n===============================================================Rectangulo 04===============================================================\n"); 
	    System.out.println(re4.toString()); 
	} 
}
