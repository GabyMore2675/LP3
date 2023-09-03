package PyFecha;
import java.util.Scanner;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 1900;
    }

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }

    public void leer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día (1 a 31): ");
        int nuevoDia = scanner.nextInt();
        System.out.print("Ingrese el mes (1 a 12): ");
        int nuevoMes = scanner.nextInt();
        System.out.print("Ingrese el año (1900 a 2050): ");
        int nuevoAño = scanner.nextInt();
        scanner.close();

        if (esFechaValida(nuevoDia, nuevoMes, nuevoAño)) {
            this.dia = nuevoDia;
            this.mes = nuevoMes;
            this.año = nuevoAño;
        } else {
            System.out.println("Fecha no válida. Se mantendrá la fecha anterior.");
        }
    }

    public boolean bisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public int diasMes(int mes) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return diasPorMes[mes - 1];
    }

    private void valida() {
        if (!esFechaValida(dia, mes, año)) {
            this.dia = 1;
            this.mes = 1;
            this.año = 1900;
        }
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
        valida();
    }

    public String corta() {
        return String.format("%02d-%02d-%04d", dia, mes, año);
    }
    
    public int diasTranscurridos() {
        int dias = dia - 1;
        for (int i = 1; i < mes; i++) {
            dias += diasMes(i);
        }
        int añosCompletos = año - 1900;
        int diasAñosCompletos = añosCompletos * 365 + contarBisiestosEnIntervalo(1900, año - 1);

        if (esBisiesto(diasAñosCompletos) && mes > 2) {
            dias++; 
        }

        return dias + diasAñosCompletos;
    }

    private int contarBisiestosEnIntervalo(int añoInicio, int añoFin) {
        int contador = 0;
        for (int año = añoInicio; año <= añoFin; año++) {
            if (esBisiesto(año)) {
                contador++;
            }
        }
        return contador;
    }

    private boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    public int diaSemana() {
        return (diasTranscurridos() + 5) % 7;
    }

    public String larga() {
        String[] diasSemana = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        return String.format("%s %d de %s de %d", diasSemana[diaSemana()], dia, nombresMeses[mes - 1], año);
    }

    public void fechaTras(long dias) {
        int totalDias = diasTranscurridos() + (int) dias;
        if (totalDias >= 0) {
            int añoCalculado = 1900 + totalDias / 365;
            while (totalDias < diasTranscurridos(añoCalculado)) {
                añoCalculado--;
            }
            this.año = añoCalculado;
            totalDias -= diasTranscurridos(añoCalculado);
            int mesCalculado = 1;
            while (totalDias >= diasMes(mesCalculado)) {
                totalDias -= diasMes(mesCalculado);
                mesCalculado++;
            }
            this.mes = mesCalculado;
            this.dia = totalDias + 1;
        } else {
            System.out.println("No se pueden calcular fechas anteriores al 1-1-1900.");
        }
    }

    public int diasEntre(Fecha fecha2) {
        // Cálculo directo sin necesidad de fechas
        int diasFecha1 = diasTranscurridos();
        int diasFecha2 = fecha2.diasTranscurridos();
        return Math.abs(diasFecha2 - diasFecha1);
    }

    public void siguiente() {
        fechaTras(1);
    }

    public void anterior() {
        fechaTras(-1);
    }

    public void fechaFutura(long dias) {
        fechaTras(dias);
    }

    public Fecha copia() {
        return new Fecha(this.dia, this.mes, this.año);
    }

    public static boolean igualQue(Fecha fecha1, Fecha fecha2) {
        return fecha1.dia == fecha2.dia && fecha1.mes == fecha2.mes && fecha1.año == fecha2.año;
    }

    public static boolean menorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.año < fecha2.año) {
            return true;
        } else if (fecha1.año == fecha2.año && fecha1.mes < fecha2.mes) {
            return true;
        } else if (fecha1.año == fecha2.año && fecha1.mes == fecha2.mes && fecha1.dia < fecha2.dia) {
            return true;
        }
        return false;
    }

    public static boolean mayorQue(Fecha fecha1, Fecha fecha2) {
        if (fecha1.año > fecha2.año) {
            return true;
        } else if (fecha1.año == fecha2.año && fecha1.mes > fecha2.mes) {
            return true;
        } else if (fecha1.año == fecha2.año && fecha1.mes == fecha2.mes && fecha1.dia > fecha2.dia) {
            return true;
        }
        return false;
    }

    private static boolean esFechaValida(int dia, int mes, int año) {
        if (año < 1900 || año > 2050 || mes < 1 || mes > 12) {
            return false;
        }
        int maxDias = new Fecha().diasMes(mes);
        return dia >= 1 && dia <= maxDias;
    }

    private static boolean contarBisiestos(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }

    private int diasTranscurridos(int año) {
        int dias = 0;
        for (int i = 1900; i < año; i++) {
            dias += contarBisiestos(i) ? 366 : 365;
        }
        return dias;
    }

    public static void main(String[] args) {
        Fecha fecha = new Fecha();
        fecha.leer();
        System.out.println("Fecha ingresada: " + fecha.corta());
        System.out.println("Días transcurridos desde el 1-1-1900: " + fecha.diasTranscurridos());
        System.out.println("Día de la semana: " + fecha.diaSemana());
        System.out.println("Fecha en formato largo: " + fecha.larga());

        Fecha fecha2 = fecha.copia();
        fecha2.fechaTras(10);
        System.out.println("Fecha tras 10 días: " + fecha2.corta());
        System.out.println("Días entre las dos fechas: " + fecha.diasEntre(fecha2));

        Fecha fecha3 = new Fecha(10, 10, 2023);
        System.out.println("Fecha 3: " + fecha3.corta());
        System.out.println("¿Fecha 3 es igual a fecha 2? " + Fecha.igualQue(fecha3, fecha2));
        System.out.println("¿Fecha 3 es menor que fecha 2? " + Fecha.menorQue(fecha3, fecha2));
        System.out.println("¿Fecha 3 es mayor que fecha 2? " + Fecha.mayorQue(fecha3, fecha2));

        fecha.siguiente();
        System.out.println("Fecha siguiente: " + fecha.corta());
        fecha.anterior();
        System.out.println("Fecha anterior: " + fecha.corta());

        fecha.fechaFutura(20);
        System.out.println("Fecha futura (20 días después): " + fecha.corta());
    }
}
