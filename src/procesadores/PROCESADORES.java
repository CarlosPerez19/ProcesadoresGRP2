package procesadores;

public class PROCESADORES {
    String nombre;
    int nucleos;
    double tdp, velocidad;
    String arquitectura;

    public PROCESADORES() {
    }

    public PROCESADORES(String nombre, int nucleos, double tdp, double velocidad, String arquitectura) {
        this.nombre = nombre;
        this.nucleos = nucleos;
        this.tdp = tdp;
        this.velocidad = velocidad;
        this.arquitectura = arquitectura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public double getTdp() {
        return tdp;
    }

    public void setTdp(double tdp) {
        this.tdp = tdp;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public String getArquitectura() {
        return arquitectura;
    }

    public void setArquitectura(String arquitectura) {
        this.arquitectura = arquitectura;
    }

    public void imprimirDatos (){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nucleos: " + getNucleos());
        System.out.println("TDP: " + getTdp() +" watts");
        System.out.println("Velocidad: " + getVelocidad() + " Ghz");
        System.out.println("Arquitectura: " + getArquitectura());
    }
}

