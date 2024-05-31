package procesadores;

public class procesadores_intel extends procesapc{
    Boolean grafica_integrada;
    String marca;
    String modelo;


    public procesadores_intel() {
    }

    public procesadores_intel(Boolean grafica_integrada, String marca, String modelo) {
        this.grafica_integrada = grafica_integrada;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Boolean getGrafica_integrada() {
        return grafica_integrada;
    }

    public void setGrafica_integrada(Boolean grafica_integrada) {
        this.grafica_integrada = grafica_integrada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprimir_grafica() {
        System.out.println("Grafica: " + grafica_integrada);

    }

    @Override
    public void imprimirDatos(){
        System.out.println("Procesador Intel ");
    }
}

