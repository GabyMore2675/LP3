package PyContador;

public class Contador {
	static int acumulador = 0; 
	final static int VALOR_INICIAL = 10;
	private int valor;
	
	static int nContadores = 0;
	static int ultimoContador = VALOR_INICIAL;

	public static int acumulador() { 
		return acumulador; 
	} 

	public Contador(int valor) { 
		this.valor = valor; 
		acumulador += valor;
		
		nContadores++;
		ultimoContador += valor;
	} 
	
	public Contador() {
		new Contador(Contador.VALOR_INICIAL);
	}

	public void inc() { 
		this.valor ++; 
		acumulador ++; 
	} 

	public int getValor() { 
		return this.valor; 
	} 
}

