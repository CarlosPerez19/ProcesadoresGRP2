import java.util.Scanner;
import procesadores.PROCESADORES;
import procesadores.Procesador_AMD;
import procesadores.procesadores_intel;
import procesadores.procesadores_moviles;

public class Main {
    public static void main(String[] args) {
        PROCESADORES pro = new PROCESADORES();
        System.out.printf("Biblioteca de Procesadores");

        // Integran 1 Carlos (El Neeko)

        Procesador_AMD procesadorAMD1 = new Procesador_AMD();
        procesadorAMD1.getSensor_temperatura();
        procesadorAMD1.setSensor_temperatura(true);
        procesadorAMD1.imprimir_datos();

        PROCESADORES nuevoprocesador  = new PROCESADORES();
        nuevoprocesador.getNombre();
        nuevoprocesador.getArquitectura();
        nuevoprocesador.getNucleos();
        nuevoprocesador.getVelocidad();
        nuevoprocesador.getTdp();

        nuevoprocesador.setNombre("Ryzen 5 5660X");
        nuevoprocesador.setArquitectura("x86");
        nuevoprocesador.setNucleos(6);
        nuevoprocesador.setVelocidad(3.5);
        nuevoprocesador.setTdp(65);
        nuevoprocesador.imprimirDatos();

        // Integrante 2 Josue Guerra
        procesadores_intel procesadorintel1 = new procesadores_intel();
        System.out.println("\nProcesadores pc");
        procesadorintel1.setMarca("Intel");
        procesadorintel1.setModelo("Core i7");
        procesadorintel1.setVelocidad(3.5);
        procesadorintel1.setNucleos(8);
        procesadorintel1.setGrafica_integrada(true);
        procesadorintel1.imprimir_datos();



        // Integrante 3 Adrian Ramos (El keepchup)
        procesadores_moviles apple = new procesadores_moviles();

        System.out.println("\nProcesadores de moviles\n");
        apple.setNombre("A17 Pro");
        apple.setNucleos(6);
        apple.setNucleosEficiencia(4);
        apple.setNucleosRendimiento(2);
        apple.setTdp(8);
        apple.setVelocidad(12.16);
        apple.setArquitectura("ARM");
        apple.setEficiencia(true);
        apple.imprimirDatos_Movil();
        apple.ahorro_Energia();
    }
}