package procesadores;

public class procesadores_moviles extends PROCESADORES{
    Boolean eficiencia;
    int nucleosEficiencia;
    int nucleosRendimiento;

    public procesadores_moviles() {
    }

    public procesadores_moviles(Boolean eficiencia) {
        this.eficiencia = eficiencia;
        this.nucleosEficiencia = 0;
        this.nucleosRendimiento = 0;
    }

    public Boolean getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(Boolean eficiencia) {
        this.eficiencia = eficiencia;
    }
    public int getNucleosEficiencia() {
        return nucleosEficiencia;
    }
    public void setNucleosEficiencia(int nucleosEficiencia) {
        this.nucleosEficiencia = nucleosEficiencia;
    }
    public int getNucleosRendimiento() {
        return nucleosRendimiento;
    }
    public void setNucleosRendimiento(int nucleosRendimiento) {
        this.nucleosRendimiento = nucleosRendimiento;
    }

    public void ahorro_Energia(){
        System.out.println("Ahorrando Energia...");
    }

    public void imprimirDatos_Movil(){
        System.out.println("Nombre: " + getNombre());
        System.out.println("Nucleos de Eficiencia: " + getNucleosEficiencia());
        System.out.println("Nucleos de Rendimiento: " + getNucleosRendimiento());
        System.out.println("Total de Nucleos: " + getNucleos());
        System.out.println("TDP: " + getTdp() +" watts");
        System.out.println("Velocidad: " + getVelocidad() + " Ghz");
        System.out.println("Arquitectura: " + getArquitectura());
    }
}
