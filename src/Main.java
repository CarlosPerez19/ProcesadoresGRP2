import java.util.Scanner;
import procesadores.PROCESADORES;
import procesadores.Procesador_AMD;

public class Main {
    public static void main(String[] args) {
        PROCESADORES pro = new PROCESADORES();
        System.out.printf("Biblioteca de Procesadores");

        // Integran 1 Carlos (El Neeko)

        Procesador_AMD procesadorAMD1 = new Procesador_AMD();
        procesadorAMD1.getSensor_temperatura();
        procesadorAMD1.setSensor_temperatura(true);
        procesadorAMD1.imprimir_datos();

        // Integrante 2 Josue Guerra

        // Integrante 3 Adrian Ramos (El keepchup)

    }
}