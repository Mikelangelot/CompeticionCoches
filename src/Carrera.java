public class Carrera {

    // Atributos
    private boolean carreraCorrida;
    private Circuito queCircuitoEs;
    private int vueltas;
    private int temporada;
    private Piloto[] piloto;
    private Piloto[] pilotoOrdenPuesto;


    //Métodos
    public double longitudTotal() {
        return queCircuitoEs.getLongitudCircuitoKM() * vueltas;
    }

<<<<<<< HEAD

    public boolean ejecutarCarrera() {
        if (carreraCorrida == true) {
            return false;
        } else {
            carreraCorrida = true;

            return true;
        }
=======
    public boolean ejecutarCarrera(){

>>>>>>> 1cace96 (cambios leves)
    }

    public String velocidadMedia() {

    }

<<<<<<< HEAD

    // Getters
    public Circuito getQueCircuitoEs() {
        return queCircuitoEs;
    }


=======
>>>>>>> 1cace96 (cambios leves)
}