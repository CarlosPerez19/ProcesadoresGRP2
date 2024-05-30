package procesadores;

public class Procesador_AMD extends PROCESADORES {

    boolean sensor_temperatura;

    public Procesador_AMD() {
    }

    public Procesador_AMD(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    public boolean isSensor_temperatura() {
        return sensor_temperatura;
    }

    public void setSensor_temperatura(boolean sensor_temperatura) {
        this.sensor_temperatura = sensor_temperatura;
    }

    public void imprimir_datos () {
        System.out.println("Sensor temperatura: " + sensor_temperatura);
    }
}
