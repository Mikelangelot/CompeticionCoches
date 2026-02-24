import java.util.Random;

public class Piloto {
    private String nombre;
    private int edad;
    private Coche coche;
    private double habilidad;
    private Random rand;

    public Piloto(String nombre, int edad,Coche coche, String inputHabilidad){
        if (inputHabilidad.equalsIgnoreCase( "Excelente")){
            //hacer un random entre 0,9 y 1
            habilidad = 0.9 + (rand.nextDouble() * 0.1);
        } else if (inputHabilidad.equalsIgnoreCase("Bueno")){
            habilidad = 0.8 + (rand.nextDouble() * 0.1);
        } else if (inputHabilidad.equalsIgnoreCase("Mediocre")){
            habilidad = 0.7 + (rand.nextDouble() * 0.1);
        } else{
            habilidad = 0.6;
        }
    }

    public double velocidadMedia(){
        double factorAleatorio = 0.9 + (rand.nextDouble() * 0.1);

        return coche.getVelocidadMaxima() * habilidad * rand.nextDouble(0.9,1);
    }

    public String getNombre(){return null;}
    public int getEdad() {return 0;}
    public Coche getCoche(){return null;}
    public String mostrarPiloto(){return null;}
    public double getHabilidad(){return 0;}


}