package Ejercicio01;
import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		int opcion = 0;
		do {
			 System.out.println("Menu");
			 System.out.println("1. Añadir contacto");
			 System.out.println("2. Buscar contacto");
			 System.out.println("3. Modificar contacto");
			 System.out.println("4. Borrar contacto");
			 System.out.println("5. Eliminar contacto");
			 System.out.println("6. Mostrar contacto");
			 System.out.println("7. Salir");
			 System.out.println("Elije una opcion");
			 opcion = sn.nextInt();
			 switch (opcion) {
				 case 1:
					 AnnadirContacto(sn);
					 break;
				 case 2:
					 break;
				 case 3:
					 break;
				 case 4:
					 break;
				 case 5:
					 break;
				 case 6:
					 break;
				 case 7:
					 break;
				 default:
					 System.out.println("Tienes que meter un valor entre 1 y 7");
			 }
		} while (opcion != 7);
	}
	
	static ArrayList <Contactos> agenda; 
	public static void AnnadirContacto(Scanner sn) {
		String nm, tl, di;
		System.out.println("Ingrese el nombre del nuevo contacto: ");
		nm = sn.nextLine();
		System.out.println("Ingrese el telefono del nuevo contacto: ");
		tl = sn.nextLine();
		System.out.println("Ingrese la dirreccion del nuevo contacto: ");
		di = sn.nextLine();
		Contactos con = new Contactos(nm, tl, di);
		agenda.add(con);
	}
	
	public static void BuscarContacto(Scanner sn) {
		String tl;
		System.out.println("Ingrese el telefono del contacto a buscar: ");
		tl = sn.nextLine();
		for (Contactos contacto: agenda) {
			if (contacto.getTelefono() == tl) {
				System.out.println("Nombre del contacto: " + contacto.getNombre());
				System.out.println("Telefono del contacto: " + contacto.getTelefono());
				System.out.println("Dirrecion del contacto: " + contacto.getDireccion());
			} else {
				System.out.println("Ese contacto no existe.");
			}
		}
	}
	
	public static void ModificarContacto(Scanner sn) {
		String tl;
		System.out.println("Ingrese el telefono del contacto a modificar: ");
		tl = sn.nextLine();
		for (Contactos contacto: agenda) {
			if (contacto.getTelefono() == tl) {
				int opcion;
				do {
					System.out.println("Menu");
					System.out.println("1. Nombre del contacto");
					System.out.println("2. Telefono del contacto");
					System.out.println("3. Dirrecion del contacto");
					System.out.println("Ingrese la opcion que desea modificar: ");
					
					System.out.println("Nombre del contacto: " + contacto.getNombre());
					System.out.println("Telefono del contacto: " + contacto.getTelefono());
					System.out.println("Dirrecion del contacto: " + contacto.getDireccion());
				} while (opcion != 4);
			} else {
				System.out.println("Ese contacto no existe.");
			}
			
		}
	}
	
	
}
