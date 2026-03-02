import java.util.Random;
public class Coche {

    private String escuderia;
    private double velocidadMaxima;
    private double fiabilidad;
    private Random rand = new Random();

    public Coche (String escuderia, double velocidadMaxima, double fiabilidad){
        this.escuderia=escuderia;
        this.velocidadMaxima=velocidadMaxima;
        this.fiabilidad=fiabilidad;

    }
    public boolean acabaCarrera (int kilometros){
        // Tira el dado 1 sola vez. Si es mayor que la fiabilidad, se rompe.
        if (rand.nextDouble() > fiabilidad) {
            return false;
        }
        return true;
    }
    public String getEscuderia(){
        return escuderia;
    }
    public double getVelocidadMaxima(){
        return velocidadMaxima;
    }
    public String mostrarCoche(){
        return null;
    }

    public double getFiabilidad() {
        return fiabilidad;
    }
}

