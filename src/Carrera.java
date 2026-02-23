public class Carrera {

    // Atributos
    private boolean carreraCorrida;
    private Circuito queCircuitoEs;
    private int vueltas;
    private int temporada;
    private Piloto[] piloto;
    private Piloto[] pilotoOrdenPuesto;


    //Métodos
    public double longitudTotal(){
        return queCircuitoEs.getLongitudCircuitoKM() * vueltas;
    }


    public boolean ejecutarCarrera(){
        if (ejecutarCarrera==true){
            return true;
        }
    }

    public String velocidadMedia(){

    }



    // Getters






}
