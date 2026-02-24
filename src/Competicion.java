public class Competicion {

    //Atributos con arrays de piloto y carrera.
    private String nombreComp;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private int numPilotos;
    private int numCarreras;
    private boolean campeonatoIniciado;
    private int temporada;

    //Respectivo Constructor
    public Competicion(String nombreComp,int maxPilotos,int maxCarreras,int temporada){
        this.nombreComp=nombreComp;
        this.pilotos=new Piloto[maxPilotos];
        this.carreras=new Carrera[maxCarreras];
        this.numPilotos=0;
        this.numCarreras=0;
        this.campeonatoIniciado=false;
        this.temporada=temporada;
    }

    public String getNombreComp(){
        return nombreComp;
    }
    //Métodos
    public boolean anhadirPiloto(Piloto piloto) {
        if (campeonatoIniciado == true) {
            System.out.println("No se puede añadir nuevos pilotos porque el campeonato ya ha comenzado");
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
         carreras[numCarreras] = new Carrera(circuito,vueltas,temporada,pilotos);
         numCarreras++;
         System.out.println("Carrera añadida");
         return true;


     }
     public boolean arrancarCampeonato(){
        if(campeonatoIniciado==true){
            return false;
        }
        campeonatoIniciado=true;
        for(int i=0;i<carreras.length;i++){
            Carrera actual=carreras[i];
            System.out.println("Corriendo la carrera " + i + " que ocurre en el circuito " + actual.getQueCircuitoEs().getNombreCircuito());
            boolean resultadoEjecucion = actual.ejecutarCarrera();
            if (resultadoEjecucion == true) {
                System.out.println("Se ha corrido con éxito esta carrera.");
            } else {
                System.out.println("Esta carrera ya se había corrido! No la corremos de nuevo. ");
            }
        }
        return true;
    }
     public void imprimirResultado(){
     }
    public void imprimirResultadoEscuderia() {
        String[] escuderias = new String[numPilotos]; //Guarda nombres escuderos
        int[] puntos = new int[numPilotos]; //Guarda nombres pilotos
        int contador= 0; //Contador a 0

        // Recorremos todas las carreras
        for(int c = 0; c < numCarreras; c++) {

            Carrera carrera = carreras[c];

            // Si la carrera no se ha corrido aún, la saltamos
            if(!carrera.ejecutarCarrera()) {
                continue;
            }
            Piloto[] puestos = carrera.getPilotoOrdenPuesto();

            for(int i=0;i< puestos.length;i++){
                int puntosPiloto=0;

                //Asignamos puntos según su posición
                if(i==0) puntosPiloto=10;
                else if (i==1) puntosPiloto=8;
                else if (i==2) puntosPiloto=5;
                else puntosPiloto=0;

                String esc = puestos[i].getCoche().getEscuderia(); //Buscar si ya está en el array de escuderías
                int pos=-1;
                for(int j=0;i<contador;j++){
                    if (escuderias[j].equals(esc)){
                        pos=j;
                        break;
                    }

                }
            }

        }
    }





}

