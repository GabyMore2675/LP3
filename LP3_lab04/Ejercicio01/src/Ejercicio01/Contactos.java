package Ejercicio01;

public class Contactos {
	private String nombre;
	private String telefono;
	private String direccion;
	
	public Contactos(String nm, String tl, String di) {
		this.nombre = nm;
		this.telefono = tl;
		this.direccion = di;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nm) {
		this.nombre = nm;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	
	public void setTelefono(String tl) {
		this.telefono = tl;
	}
	
	public String getDireccion() {
		return this.direccion;
	}
	public void setDireccion(String di) {
		this.direccion = di;
	}
}