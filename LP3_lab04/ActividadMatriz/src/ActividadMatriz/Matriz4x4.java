package ActividadMatriz;
import java.util.Scanner;

public class Matriz4x4 {
	public static void main(String[] args) {
		 Scanner sn = new Scanner(System.in);
		 
		 //Matriz cuadrada de 4x4
		 int matriz[][] = new int[4][4];
		 
		 //Variables utilizadas
		 boolean salir = false;
		 int opcion, fila;
		 
		 //Utilizado para indicar si hemos entrado en la 1ª opcion
		 boolean rellenado = false;
		 
		 //Menu
		 do {
			 //Mensajes del menu
			 System.out.println("Menu");
			 System.out.println("1. Rellenar Matriz");
			 System.out.println("2. Sumar fila");
			 System.out.println("3. Sumar diagonal principal");
			 System.out.println("4. Media de todos los valores de la Matriz");			 
			 System.out.println("5. Salir");
			 System.out.println("Elije una opcion");
			 opcion = sn.nextInt();
			 switch (opcion) {
				 case 1:
					 rellenarMatriz(sn, matriz);
					 //Ahora si podemos acceder al resto de opciones
					 rellenado = true;
					 break;
			 case 2:
				 if (rellenado) {
				 //Validamos la fila
					 do {
						 System.out.println("Elige una fila");
						 fila = sn.nextInt();
					 } while (!(fila >= 0 && fila < matriz.length));
					 System.out.println("La suma de los valores de la fila " + fila + " es: " + sumaFila(matriz, fila));
				 } else {
					 System.out.println("Debes rellenar la matriz primero");
				 }
				 break;
			 case 3:
				 System.out.println("La suma de los valores de la diagonal principal es: ");
				 System.out.println(sumaDiagonal(matriz));
				 break;
			 case 4:
				 System.out.println("La suma de los valores de la diagonal inversa es: ");
				 System.out.println(sumaDiagonal(matriz));
				 break;
			 case 5:
				 System.out.println("La media de todos los valores de la matriz es: ");
				 System.out.println(media(matriz));
			 case 6:
				 salir = true;
				 break;
			 default:
				 System.out.println("Tienes que meter un valor entre 1 y 5");
			 }
		 } while (!salir);
		 System.out.println("FIN");
	}
	/**
	* Rellena la matriz con valores insertados por el usuario
	*
	* @param sn
	* @param matriz
	*/
	public static void rellenarMatriz(Scanner sn, int[][] matriz) {
		 for (int i = 0; i < matriz.length; i++) {
			 for (int j = 0; j < matriz[0].length; j++) {
				 System.out.println("Escribe un numero en la posicion " + i + " " + j);
				 matriz[i][j] = sn.nextInt();
			 }
		 }
	}
	/**
	* Suma los valores de una determinada fila
	*
	* @param matriz
	* @param fila
	* @return
	*/
	public static int sumaFila(int[][] matriz, int fila) {
		 int suma = 0;
		 for (int j = 0; j < matriz.length; j++) {
			 suma += matriz[fila][j];
		 }
		 return suma;
	}
	/**
	* Suma los valores diagonal principal
	*
	* @param matriz
	* @param fila
	* @return
	*/
	public static int sumaDiagonal(int[][] matriz) {
		int nuevoNum;
		int num;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				num = matriz[fila][columna];
				nuevoNum = (int) Math.pow(num, 2);
				int[][] nMatriz = matriz;
				if (fila == columna) {
					nMatriz[fila][columna] = nuevoNum;
					System.out.printf("      %d", nuevoNum);
				}
				else {
					nMatriz[fila][columna] = 0;
					System.out.printf("      %d", nMatriz[fila][columna]);
				}	
			}
		}
		return num = 0;
	}
	/**
	* Suma los valores diagonal inversa
	*
	* @param matriz
	* @param fila
	* @return
	*/
	public static int sumaDiagonalinversa(int[][] matriz) {
		int nuevoNum;
		int num;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				num = matriz[fila][columna];
				nuevoNum = (int) Math.pow(num, 2);
				int[][] nMatriz = matriz;
				if (fila + columna == 3) {
					nMatriz[fila][columna] = nuevoNum;
					System.out.printf("      %d", nuevoNum);
				}
				else {
					nMatriz[fila][columna] = 0;
					System.out.printf("      %d", nMatriz[fila][columna]);
				}	
			}
		}
		return num = 0;
	}
	/**
	* Media de los valores de la matriz
	*
	* @param matriz
	* @param fila
	* @return
	*/
	public static void media(int[][] matriz) {
		int con = 0;
		int suma = 0;
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++)
				con ++;
				suma += matriz[fila][columna];
			System.out.println();
		}
		int media = suma/con;
		System.out.println("La media de todos los valores de la matriz es: " + media);
	}
}
