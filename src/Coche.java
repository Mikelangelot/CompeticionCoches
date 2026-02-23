import java.util.Random;
public class Coche {

    private String escuderia;
    private double velocidadMaxima;
    private double fiabilidad;
    private Random rand;

    public Coche (String escuderia, double velocidadMaxima, double fiabilidad){
        this.escuderia=escuderia;
        this.velocidadMaxima=velocidadMaxima;
        this.fiabilidad=fiabilidad;

    }
    public boolean acabaCarrera (int kilometros){
        int tramos = kilometros / 5;

        /*Mientras se cumpla la condición recorremos el bucle y si el número random que se genera es
        mayor que la fiabilidad (es decir está por encima) rompe (no acaba la carrera, devuelve false),
        si es menor que la fiabilidad no rompe (acaba la carrera, devuelve true)*/

        for (int i = 0; i < tramos; i++) {
            if (rand.nextDouble() > fiabilidad) {
                return false;
            }
        }
        return true;
    }
    public String getEscuderia(){
        return null;
    }
    public double getVelocidadMaxima(){
        return 0;
    }
    public String mostrarCoche(){
        return null;
    }

    public double getFiabilidad() {
        return fiabilidad;
    }
}

