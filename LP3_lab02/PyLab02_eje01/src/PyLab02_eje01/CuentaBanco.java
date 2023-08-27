package PyLab02_eje01;

public class CuentaBanco {
	private String titular;
	private double cantidad;
	
	public CuentaBanco (String ti, double ca) {
		this.titular = ti;
		this.cantidad = ca;
	}
	
	public CuentaBanco (String ti) {
		this.titular = ti;
		this.cantidad = 0.0;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public void setTitular(String ti) {
		this.titular = ti;
	}
	
	public double getCantidad() {
		return this.cantidad;
	}
	
	public void setCantidad(double ca) {
		this.cantidad = ca;
	}
	
	@Override
	public String toString() {
		 return "CuentaBancaria: " + "Titular = " + titular + ", Cantidad = " + cantidad;
	}
	
	public void Ingresar(double can) {
		if (can > 0)
			this.cantidad = this.cantidad + can;
		else
			System.out.println("La cantidad ingresada es negativa");
	}
	
	public void Retirar(double can) {
		if (can <= this.cantidad)
			this.cantidad = this.cantidad - can;
		else
			System.out.println("La cantidad ingresada es mayor a la que se tiene en la cuenta");
		System.out.println("Cantidad en la cuenta: " + this.cantidad);
	}
	
	public double SaldoActual() {
		return this.cantidad;
	}
}