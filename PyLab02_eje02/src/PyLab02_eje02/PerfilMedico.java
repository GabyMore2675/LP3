package PyLab02_eje02;

public class PerfilMedico {
	public String nombre;
	public String apellido;
	public String sexo;
	public int dia;
	public int mes;
	public int anno;
	public int altura;
	public double peso;
	
	public PerfilMedico(String nm, String ap, String sx, int d, int m, int a, int al, double ps) {
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
	
	public void setAltura(int al) {
		this.altura = al; 
	}
	
	public int getAltura() {
		return this.altura;
	}
	
	public void setPeso(double ps) {
		this.peso = ps;
	}
	
	public double getPeso() {
		return this.peso;
	}
	
	public void ObEdad() {
		int edad;
		edad = 2023 - this.anno;
		System.out.print("Tu edad es: " + edad);
	}
	
	public void FCM(PerfilMedico pM) {
		double FCM;
		FCM = 208 - 0.7(pM.ObEdad());
	}
}
