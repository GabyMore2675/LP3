package Arreglo_Metodos;

public class ArrayBidimensional {
	public static void main(String[] args) {
		int[][] arreglo1 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] arreglo2 = { { 1, 2 }, { 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		System.out.println("Los valores en arreglo1 por filas son: ");
		imprimirArreglo(arreglo1);
		
		System.out.println("Los valores en arreglo1 multiplicados son: ");
		multiplicarArreglo(arreglo1);
		
		System.out.println("Los valores en arreglo1 multiplicados en diagonal son: ");
		multiplicarDiagonalArreglo(arreglo1);
		
		System.out.println("\n\nLos valores en arreglo2 por filas son: ");
		imprimirArreglo(arreglo2);
		
		System.out.println("Los valores en arreglo2 multiplicados son: ");
		multiplicarArreglo(arreglo2);
		
		System.out.println("Los valores en arreglo2 multiplicados en diagonal son: ");
		multiplicarDiagonalArreglo(arreglo2);
	}
	
	public static void imprimirArreglo(int[][] arreglo) {
		for (int fila = 0; fila < arreglo.length; fila++) {
			for (int columna = 0; columna < arreglo[fila].length; columna++)
				System.out.printf("      %d", arreglo[fila][columna]);
			
			System.out.println();
		}
	}
	
	public static void multiplicarArreglo(int[][] arreglo) {
		int nuevoNum;
		int num;
		for (int fila = 0; fila < arreglo.length; fila++) {
			for (int columna = 0; columna < arreglo[fila].length; columna++) {
				num = arreglo[fila][columna];
				nuevoNum = (int) Math.pow(num, 2);
				System.out.printf("      %d", nuevoNum);
			}
			
			System.out.println();
		}
	}
	
	public static void multiplicarDiagonalArreglo(int[][] arreglo) {
		int nuevoNum;
		int num;
		for (int fila = 0; fila < arreglo.length; fila++) {
			for (int columna = 0; columna < arreglo[fila].length; columna++) {
				num = arreglo[fila][columna];
				nuevoNum = (int) Math.pow(num, 2);
				int[][] nArreglo = arreglo;
				if (fila == columna) {
					nArreglo[fila][columna] = nuevoNum;
					System.out.printf("      %d", nuevoNum);
				}
				else {
					nArreglo[fila][columna] = 0;
					System.out.printf("      %d", nArreglo[fila][columna]);
				}	
			}
			System.out.println();
		}
	}
}
