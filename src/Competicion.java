public class Competicion {

    //Atributos con arrays de piloto y carrera.
    private String nombreComp;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private int numPilotos;
    private int numCarreras;
    private boolean campeonatoIniciado;

    //Respectivo Constructor
    public Competicion(String nombreComp,int maxPilotos,int maxCarreras){
        this.nombreComp=nombreComp;
        this.pilotos=new Piloto[maxPilotos];
        this.carreras=new Carrera[maxCarreras];
        this.numPilotos=0;
        this.numCarreras=0;
    }

    public String getNombreComp(){
        return nombreComp;
    }
    //Métodos
     public boolean anhadirPiloto(Piloto piloto){
        return false;
     }
     public boolean anhadirCarrera(Circuito circuito, int vueltas){
        return false;
     }
     public boolean arrancarCampeonato(){
        return false;
    }
     public void imprimirResultado(){
     }
    public void imprimirResultadoEscuderia() {
    }


}

