import java.util.Random;

public class Coche {

    private String escuderia;
    private double velocidadMaxima;
    private double fiabilidad;
    private Random rand = new Random();

    public Coche(String escuderia, double velocidadMaxima, double fiabilidad) {
        this.escuderia = escuderia;
        this.velocidadMaxima = velocidadMaxima;
        this.fiabilidad = fiabilidad;

    }

    public boolean acabaCarrera(int kilometros) {
        //Tira el dado una vez por cada 5 km de la carrera.
        int tramos = kilometros / 5;
        for (int i = 0; i < tramos; i++) {
            if (rand.nextDouble() > fiabilidad) {
                return false; // Se rompe
            }
        }
        return true; // Acaba la carrera
    }

    public String getEscuderia() {
        return escuderia;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String mostrarCoche() {
        return "Escudería " + escuderia + ", velocidad máxima: " + velocidadMaxima;
    }

}

