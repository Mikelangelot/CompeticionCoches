public class Carrera {

    // Atributos
    private boolean carreraCorrida;
    private Circuito queCircuitoEs;
    private int vueltas;
    private int temporada;
    private Piloto[] piloto;
    private Piloto[] pilotoOrdenPuesto;

    public Carrera(Circuito queCircuitoEs, int vueltas, int temporada, Piloto[] piloto) {
        this.carreraCorrida = false;
        this.queCircuitoEs = queCircuitoEs;
        this.vueltas = vueltas;
        this.temporada = temporada;
        this.piloto = piloto;
        this.pilotoOrdenPuesto = new Piloto[piloto.length];

    //Métodos
    public double longitudTotal() {
        return queCircuitoEs.getLongitudCircuitoKM() * vueltas;
    }

    public boolean ejecutarCarrera() {
        if (carreraCorrida == true) {
            return false;
        } else {
            carreraCorrida = true;

            return true;
        }

    }

    public String velocidadMedia() {
return null;
    }


    // Getters
    public Circuito getQueCircuitoEs() {
        return queCircuitoEs;
    }


}