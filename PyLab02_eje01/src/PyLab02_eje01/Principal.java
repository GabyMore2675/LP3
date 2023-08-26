package PyLab02_eje01;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String ti;
		double can;
		int op;
		double c;
		op = 3;
		
		System.out.println("Ingrese el nombre del titular: ");
		ti = sc.nextLine();
		System.out.println("Ingrese la cantidad inicial: ");
		can = sc.nextInt();
		System.out.println("------------Informacion de la cuenta------------");
		CuentaBanco cB = new CuentaBanco(ti, can);
		System.out.println(cB.toString());
		
		while(op != 4) {
			System.out.println("=================MENU=================");
			System.out.println("1. Ingresar.");
			System.out.println("2. Retirar.");
			System.out.println("3. Mostrar saldo actual.");
			System.out.println("4. Salir. ");
			op = sc.nextInt();
			
			if (op == 1)
				System.out.println("Cantidad a ingresar: ");
				c = sc.nextInt();
				cB.Ingresar(c);
			
			if (op == 2)
				System.out.println("Cantidad a retirar: ");
				c = sc.nextInt();
				cB.Retirar(c);
			
			if (op == 3)
				cB.SaldoActual();
			
			if (op == 4)
				System.out.println("Saliendo....");
			
			else
				System.out.println("Opcion incorrecta");
		}
	}
}
