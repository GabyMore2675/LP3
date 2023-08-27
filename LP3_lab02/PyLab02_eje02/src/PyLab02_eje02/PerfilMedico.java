package PyLab02_eje02;

public class PerfilMedico {
	public String nombre;
	public String apellido;
	public String sexo;
	public int dia;
	public int mes;
	public int anno;
	public double altura;
	public double peso;
	private int edad;
	
	public PerfilMedico(String nm, String ap, String sx, int d, int m, int a, double al, double ps) {
		this.nombre = nm;
		this.apellido = ap;
		this.sexo = sx;
		this.dia = d;
		this.mes = m;
		this.anno = a;
		this.altura = al;
		this.peso = ps;
	}
	
	public PerfilMedico() {
		this.nombre = "Juan";
		this.apellido = "Perez";
		this.sexo = "M";
		this.dia = 23;
		this.mes = 12;
		this.anno = 1999;
		this.altura = 180;
		this.peso = 59.8;
	}
	
	public void setNombre(String nm) {
		this.nombre = nm;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setApellido(String ap) {
		this.apellido = ap;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public void setSexo(String sx) {
		this.sexo = sx;
	}
	
	public String getSexo() {
		return this.sexo;
	}
	
	public void setDia(int d) {
		this.dia = d;
	}
	
	public int getDia() {
		return this.dia;
	}
	
	public void setMes(int m) {
		this.mes = m;
	}
	
	public int getMes() {
		return this.mes;
	}
	
	public void setAnno(int a) {
		this.anno = a;
	}
	
	public int getAnno() {
		return this.anno;
	}
	
	public void setAltura(double al) {
		this.altura = al; 
	}
	
	public double getAltura() {
		return this.altura;
	}
	
	public void setPeso(double ps) {
		this.peso = ps;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void ObEdad() {
		this.edad = 2023 - this.anno;
		System.out.print("Tu edad es: " + this.edad);
	}
	
	public void FCM() {
		double FCM;
		FCM = 208 - (0.7 * this.edad);
		System.out.print("Tu frecuencia cardiaca maxima es: " + FCM);
	}
	
	public void IMC() {
		double IMC;
		double cmA;
		cmA = this.altura * 0.01;
		IMC = this.peso / (cmA * cmA);
		System.out.print("Tu indice de masa corporal es: " + IMC);
	}
}
