package PyFecha;

public class Principal {
    public static void main(String[] args) {
        Fecha fecha1 = new Fecha(); // Fecha predeterminada: 1-1-1900
        System.out.println("Fecha 1 (predeterminada): " + fecha1.corta());

        Fecha fecha2 = new Fecha(31, 12, 2000); // Fecha con valores específicos
        System.out.println("Fecha 2 (con valores específicos): " + fecha2.corta());

        fecha1.leer(); // Pedir al usuario una nueva fecha
        System.out.println("Fecha 1 (después de leer): " + fecha1.corta());

        if (fecha1.bisiesto()) {
            System.out.println("Fecha 1 es un año bisiesto.");
        } else {
            System.out.println("Fecha 1 no es un año bisiesto.");
        }

        int diasDelMes = fecha1.diasMes(fecha1.getMes());
        System.out.println("Días en el mes de la Fecha 1: " + diasDelMes);

        System.out.println("Días transcurridos desde el 1-1-1900 hasta Fecha 1: " + fecha1.diasTranscurridos());

        int diaSemana = fecha1.diaSemana();
        System.out.println("Día de la semana de Fecha 1 (0 para domingo, 6 para sábado): " + diaSemana);

        System.out.println("Fecha 1 en formato largo: " + fecha1.larga());

        fecha2.fechaTras(30); // Agregar 30 días a Fecha 2
        System.out.println("Fecha 2 después de agregar 30 días: " + fecha2.corta());

        int diasEntre = fecha1.diasEntre(fecha2);
        System.out.println("Días entre Fecha 1 y Fecha 2: " + diasEntre);

        fecha1.siguiente(); // Avanzar al día siguiente
        System.out.println("Fecha 1 después de avanzar un día: " + fecha1.corta());

        fecha1.anterior(); // Retroceder al día anterior
        System.out.println("Fecha 1 después de retroceder un día: " + fecha1.corta());

        fecha1.fechaFutura(15); // Agregar 15 días a Fecha 1
        System.out.println("Fecha 1 después de agregar 15 días: " + fecha1.corta());

        Fecha copiaFecha2 = fecha2.copia(); // Crear una copia de Fecha 2
        System.out.println("Copia de Fecha 2: " + copiaFecha2.corta());

        boolean sonIguales = Fecha.igualQue(fecha1, fecha2);
        System.out.println("¿Fecha 1 es igual a Fecha 2? " + sonIguales);

        boolean esMenor = Fecha.menorQue(fecha1, fecha2);
        System.out.println("¿Fecha 1 es menor que Fecha 2? " + esMenor);

        boolean esMayor = Fecha.mayorQue(fecha1, fecha2);
        System.out.println("¿Fecha 1 es mayor que Fecha 2? " + esMayor);
    }
}
