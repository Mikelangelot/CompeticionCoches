public class Circuito {

    // Atributos Privados de Circuito

    private String nombreCircuito;
    private int longitudCircuitoKM;
    private Carrera [] arrayCarreras;


    // Constructor de Circuito, llamando a los atributos privados

    public Circuito(String nombreCircuito, int longitudCircuitoKM, Carrera[] arrayCarreras) {
        this.nombreCircuito = nombreCircuito;
        this.longitudCircuitoKM = longitudCircuitoKM;
        this.arrayCarreras = arrayCarreras;
    }


    //Métodos
    public void anhadirCarrera(Carrera arrayCarreras){
        return 0;
    }

    public int obtenerCarrerasTotales(){
        return 0;
    }

    //Getters

    public int getLongitudCircuitoKM() {
        return longitudCircuitoKM;
    }

    public String getNombreCircuito() {
        return nombreCircuito;
    }
}
