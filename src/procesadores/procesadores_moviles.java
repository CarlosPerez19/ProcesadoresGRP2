package procesadores;

public class procesadores_moviles extends PROCESADORES{
    Boolean eficiencia;

    public procesadores_moviles() {
    }

    public procesadores_moviles(Boolean eficiencia) {
        this.eficiencia = eficiencia;
    }

    public Boolean getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(Boolean eficiencia) {
        this.eficiencia = eficiencia;
    }

    public void ahorro_Energia(){
        System.out.println("Ahorrando Energia...");
    }
}
