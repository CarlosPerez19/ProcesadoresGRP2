package procesadores;

public class procesadores_intel extends procesapc{
    Boolean grafica_integrada;

    public procesadores_intel() {
    }

    public procesadores_intel(Boolean grafica_integrada) {
        this.grafica_integrada = grafica_integrada;
    }

    public Boolean getGrafica_integrada() {
        return grafica_integrada;
    }

    public void setGrafica_integrada(Boolean grafica_integrada) {
        this.grafica_integrada = grafica_integrada;
    }

    public void imprimir_grafica() {
        System.out.println(grafica_integrada);
    }
}

