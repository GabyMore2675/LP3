package Arreglo_Metodos;

public class Array {
	public static void main(String[] args) {
		int[] arreglo = { 1, 2, 3, 4, 5 };
		System.out.println(
				"Efectos de pasar una referencia a un arreglo completo:\n"+
				"Los valores del arreglo original son: ");
		
		for(int valor : arreglo) 
			System.out.printf("      %d", valor);
		
		Object modificarArreglo;
		modificarArreglo(arreglo);
		System.out.println("\n\nLos valores del arreglo modificado son:");
		
		for(int valor : arreglo)
			System.out.printf("       %d", valor);
	}
	
	public static void modificarArreglo(int[] arreglo2) {
		for(int contador = 0; contador < arreglo2.length; contador++)
			arreglo2[contador] *=2;
	}
}	
