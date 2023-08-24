package PyLab02;
import java.util.Scanner;

public class ClasePrincipal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double pF;
		double tF;
		int eF;
		double pP;
		double tP;
		int eP;
		
		ClasePerro Fido = new ClasePerro("Chihuahua","marrón");
		ClasePerro Pelusa = new ClasePerro("Pequines","blanco");
		Fido.increEdad(2);
		Pelusa.increEdad(5);
		
		System.out.println("------------------------------------Fido------------------------------------");
		System.out.println(Fido.toString());
		System.out.println("------------------------------------Pelusa------------------------------------");
		System.out.println(Pelusa.toString());
		ClaseDiagnostico FidoD = new ClaseDiagnostico(Fido);
		ClaseDiagnostico PelusaD = new ClaseDiagnostico(Pelusa);
		
		System.out.println("Ingrese la nueva temperatura de Fido: ");
		tF = sc.nextInt();
		Fido.setTemp(tF);
		System.out.println("Ingrese el nuevo peso de Fido: ");
		pF = sc.nextInt();
		Fido.setPeso(pF);
		System.out.println("Ingrese la nueva edad de Fido: ");
		eF = sc.nextInt();
		Fido.setEdad(eF);
		System.out.println("Ingrese la nueva temperatura de Pelusa: ");
		tP = sc.nextInt();
		Pelusa.setTemp(tP);
		System.out.println("Ingrese el nuevo peso de Pelusa: ");
		pP = sc.nextInt();
		Pelusa.setPeso(pP);
		System.out.println("Ingrese la nueva edad de Pelusa: ");
		eP = sc.nextInt();
		Pelusa.setEdad(eP);
		
		System.out.println("------------------------------------Fido------------------------------------");
		System.out.println(Fido.toString());
		System.out.println("------------------------------------Pelusa------------------------------------");
		System.out.println(Pelusa.toString());
		
		System.out.println("Diagnostico Fido:");
		FidoD.AptoVacunaA(Fido.getTemp(), Fido.getPeso(), Fido.getEdad());
		FidoD.AptoVacunaB(Fido.getTemp(), Fido.getPeso(), Fido.getEdad());
		System.out.println("Diagnostico Pelusa:");
		PelusaD.AptoVacunaA(Pelusa.getTemp(), Pelusa.getPeso(), Pelusa.getEdad());
		PelusaD.AptoVacunaB(Pelusa.getTemp(), Pelusa.getPeso(), Pelusa.getEdad());
	}
}
