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
     public boolean anhadirPiloto(Piloto piloto){
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

        // Recorremos todas las carreras
        for(int c = 0; c < numCarreras; c++) {

            Carrera carrera = carreras[c];

            // Si la carrera no se ha corrido aún, la saltamos
            if(!carrera.ejecutarCarrera()) {
                continue;
            }

        }
    }



}

