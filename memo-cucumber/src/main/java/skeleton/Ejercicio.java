package skeleton;

public class Ejercicio {
    private int kilometros;
    private int CaloriasPorKilometro;

    public void setKilometros(int kilometros) {
        this.kilometros = kilometros;
    }
    public void setCalorias(int CaloriasPorKilometro) {
        this.CaloriasPorKilometro = CaloriasPorKilometro;
    }

    public int getCaloriasQuemadas() {
        return kilometros * CaloriasPorKilometro;
    }
    public int getCaloriasFinales(int caloriasIngeridas) {
        return  this.getCaloriasQuemadas() - caloriasIngeridas;
    }

}
