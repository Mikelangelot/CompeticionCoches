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
    public void anhadirCarrera(carrera:Carrera){
    }
    public int obtenerCarrerasTotales(){
        return 0;
    }
}
