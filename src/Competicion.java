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
        this.campeonatoIniciado=false;
    }

    public String getNombreComp(){
        return nombreComp;
    }
    //Métodos
    public boolean anhadirPiloto(Piloto piloto) {
        if (campeonatoIniciado == true) {
            System.out.println("No se puede añadir nuevos pilotos porque el campeonato " +
                    "ya ha comenzado");
        } else {
            Piloto[] nuevo = new Piloto[pilotos.length + 1];
            for (int i = 0; i < pilotos.length; i++) {
                nuevo[i] = pilotos[i];
            }
            nuevo[nuevo.length - 1] = piloto;
            pilotos = nuevo;

        }
        return false;
     }
     public boolean anhadirCarrera(Circuito circuito, int vueltas){

        if(campeonatoIniciado){
            System.out.println("No se puede añadir carrera, el campeonato ya se ha iniciado.");
            return false;
        }
        //Comprobar si ya existe carrera en el circuito
         for(int i=0;i<numCarreras;i++){
             if(carreras[i].getQueCircuitoEs() == circuito){
                 System.out.println("Ya existe una carrera en el circuito");
                 return false;
             }
         } // Añadir carrera sin que llege al límite
         carreras[numCarreras] = new Carrera();
         numCarreras++;
         System.out.println("Carrera añadida");
         return true;


     }
     public boolean arrancarCampeonato(){
        return false;
    }
     public void imprimirResultado(){
     }
    public void imprimirResultadoEscuderia() {
        String[] escuderias = new String[numPilotos]; //Guarda nombres escuderos
        int[] puntos = new int[numPilotos]; //Guarda nombres pilotos
        int contador= 0;
    }



}

