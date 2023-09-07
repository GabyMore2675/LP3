package PyContador;

public class ContadorTest3 {
    public static void main(String[] args) {
        
        Contador c1 = new Contador(5);
        Contador c2 = new Contador();

        c1.inc(); 
        c2.inc(); 

        System.out.println("Valor contador1: " + c1.getValor());
        System.out.println("Valor contador2: " + c2.getValor());
        System.out.println("Acumulador: " + Contador.acumulador());
        System.out.println("Numero de contadores creados: " + Contador.nContadores);
        System.out.println("Ultimo valor inicial del contador creado: " + Contador.ultimoContador);
    }
}

