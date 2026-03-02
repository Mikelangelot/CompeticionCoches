public class Circuito {

    // Atributos Privados de Circuito

    private String nombreCircuito;
    private int longitudCircuitoKM;
    private Carrera [] arrayCarreras;


    // Constructor de Circuito, llamando a los atributos privados

    public Circuito(String nombreCircuito, int longitudCircuitoKM) {
        this.nombreCircuito = nombreCircuito;
        this.longitudCircuitoKM = longitudCircuitoKM;
        this.arrayCarreras = new Carrera[0];
    }


    //Métodos
    public void anhadirCarrera(Carrera carrera){
        for (int i = 0; i < arrayCarreras.length; i++) {
            if (arrayCarreras[i]==null) {
                arrayCarreras[i]=carrera;
            }
        }
        System.out.println("Carreras añadidas");
    }

    public int obtenerCarrerasTotales(){
        int total = 0;
        for (int i = 0; i < arrayCarreras.length; i++) {
            if (arrayCarreras[i] != null) {
                total++;
            }
        }
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
