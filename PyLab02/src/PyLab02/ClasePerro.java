package PyLab02;

public class ClasePerro {
	private String raza;
	private int edad;
	private String color;
	public double peso;
	private double temp;
	public ClasePerro(String raza, String color) {
		 this.raza = raza;
		 this.color = color;
		 this.temp = 37;
		 this.edad = 1;
		 this.peso = 0.5;
	}
	public ClasePerro() {
		 this.raza = "chusco";
		 this.color = "gris";
		 this.temp = 37;
		 this.edad = 1;
		 this.peso = 0.5;
	}
	
	public String getRaza() {
		 return raza;
	}
	
	public void setRaza(String raza) {
		 this.raza = raza;
	}
	
	public String getColor() {
		 return color;
	}
	
	public void setColor(String color) {
		 this.color = color;
	}
	
	public double getTemp() {
		 return temp;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	public int getEdad() {
		 return edad;
	}
	
	public void setEdad(int edad) {
		 this.edad = edad;
	}
	
	public double getPeso() {
		return peso;
	}
	
	@Override
	public String toString() {
		 return "Perro{" + "raza = " + raza + ", color = " + color + ", temp = " + temp + ", edad = " + edad + ", peso = " + peso + '}';
	}
	
	public void ladrar() {
		System.out.println("Guau Guauu");
	}
	
	public void dormir() {
		System.out.println("zzzz zzzzz");
	}
	
	public void comer() {
		System.out.println("pka pka...");
	}
	
	public void increEdad(int anios){
		 this.edad = this.edad + anios;
		 cambiarPeso(anios);
	}
    
	private void cambiarPeso(int anios){
		 this.peso = this.peso + (anios * 1.5);
	}
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
}

