public class Piloto {
    private String nombre;
    private int edad;
    private Coche coche;
    private double habilidad;

    public Piloto(String nombre, int edad,Coche coche, double habilidad){
    }

    public double velocidadMedia(){
        double factorAleatorio = 0.9 + (rand.nextDouble() * 0.1);

        return coche.getVelocidadMaxima() * habilidad * factorAleatorio * coche.;
    }

    public String getNombre(){return null;}
    public int getEdad() {return 0;}
    public Coche getCoche(){return null;}
    public String mostrarPiloto(){return null;}
    public double getHabilidad(){return 0;}

}
