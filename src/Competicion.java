import java.lang.reflect.Array;

public class Competicion {

    private String nombreComp;
    private Piloto[] pilotos;
    private Carrera[] carreras;
    private int numPilotos;
    private int numCarreras;
    private boolean campeonatoIniciado;
    private int temporada;


    public Competicion(String nombreComp, int temporada) {
        this.nombreComp = nombreComp;
        this.pilotos = new Piloto[0];
        this.carreras = new Carrera[0];
        this.numPilotos = 0;
        this.numCarreras = 0;
        this.campeonatoIniciado = false;
        this.temporada = temporada;
    }

    public String getNombreComp() {
        return nombreComp;
    }

    public boolean anhadirPiloto(Piloto piloto) {
        if (campeonatoIniciado) {
            System.out.println("No se puede añadir nuevos pilotos porque el campeonato ya ha comenzado");
            return false;

        } else {
            Piloto[] nuevo = new Piloto[pilotos.length + 1];
            for (int i = 0; i < pilotos.length; i++) {
                nuevo[i] = pilotos[i];
            }
            nuevo[numPilotos] = piloto;
            pilotos = nuevo;
            numPilotos++;
            return true;
        }
    }

    public boolean anhadirCarrera(Circuito circuito, int vueltas) {

        if (campeonatoIniciado) {
            System.out.println("\nNo se puede añadir carrera, el campeonato ya se ha iniciado.");
            return false;
        }
        for (int i = 0; i < numCarreras; i++) {
            if (carreras[i].getQueCircuitoEs() == circuito) {
                System.out.println("\nYa existe una carrera en el circuito");
                return false;
            }
        }
        Carrera[] nuevo = new Carrera[numCarreras + 1];

        for (int i = 0; i < numCarreras; i++) {
            nuevo[i] = carreras[i];
        }
        nuevo[numCarreras] = new Carrera(circuito, vueltas, temporada, pilotos);

        carreras = nuevo;
        numCarreras++;
        System.out.println("Carrera añadida correctamente");
        return true;

    }

    public boolean arrancarCampeonato() {
        if (campeonatoIniciado == true) {
            return false;
        }
        campeonatoIniciado = true;
        for (int i = 0; i < carreras.length; i++) {
            Carrera actual = carreras[i];
            System.out.println("\nCorriendo la carrera Nº" + i + " que ocurre en ' " + actual.getQueCircuitoEs().getNombreCircuito() + " ' " + ":");
            boolean resultadoEjecucion = actual.ejecutarCarrera();
            if (resultadoEjecucion == true) {
                System.out.println("\nSe ha corrido con éxito esta carrera.");
            } else {
                System.out.println("\nEsta carrera ya se había corrido! No la corremos de nuevo.");
            }
        }
        return true;
    }

    public void imprimirResultado() {
        int[] arrayPuntos = new int[pilotos.length];
        //Recorremos el array de carreras en este for
        for (int i = 0; i < carreras.length; i++) {
            Carrera c = carreras[i];
            // Detectar quienes quedaron en 1ª,2ª y 3ª posicion (Porque son los únicos que van a recibir puntos)
            Piloto primero = c.getPilotoOrdenPorPuesto()[0];
            Piloto segundo = c.getPilotoOrdenPorPuesto()[1];
            Piloto tercero = c.getPilotoOrdenPorPuesto()[2];
            // Recorro tod0 el array de pilotos generales.
            for (int posicionArray = 0; posicionArray < pilotos.length; posicionArray++) {
                // Primera Posición del array sumamos 10 puntos
                if (pilotos[posicionArray] == primero) {
                    arrayPuntos[posicionArray] = arrayPuntos[posicionArray] + 10;
                    // Segunda posición del array sumamos 8 puntos
                } else if (pilotos[posicionArray] == segundo) {
                    arrayPuntos[posicionArray] = arrayPuntos[posicionArray] + 8;
                    // Tercera Posición del array sumamos 5 puntos
                } else if (pilotos[posicionArray] == tercero) {
                    arrayPuntos[posicionArray] = arrayPuntos[posicionArray] + 5;
                }
            }
        }
        System.out.println("\n--CLASIFICACIÓN GENERAL--");
        System.out.println("-Competición -> " + nombreComp + "-\n");
        for (int i=0;i< numPilotos;i++){
            System.out.println(pilotos[i].getNombre() + " - " + arrayPuntos[i] + " puntos");
        }
    }


    public void imprimirResultadoEscuderia() {
        String[] escuderias = new String[numPilotos];
        int[] puntos = new int[numPilotos];
        int contador = 0;

        String nombreCarreraActual = "Ninguna";
        for (int i = numCarreras - 1; i >= 0; i--) {
            if (carreras[i].isCarreraCorrida()) {
                nombreCarreraActual = carreras[i].getQueCircuitoEs().getNombreCircuito();
                break;
            }
        }


        for (int c = 0; c < numCarreras; c++) {
            Carrera carrera = carreras[c];


            if (!carrera.isCarreraCorrida()) {
                continue;
            }
            Piloto[] puestos = carrera.getPilotoOrdenPorPuesto();

            for (int i = 0; i < puestos.length; i++) {
                int puntosPiloto;


                if (i == 0) puntosPiloto = 10;
                else if (i == 1) puntosPiloto = 8;
                else if (i == 2) puntosPiloto = 5;
                else puntosPiloto = 0;

                String esc = puestos[i].getCoche().getEscuderia();
                int pos = -1;

                for (int j = 0; j < contador; j++) {
                    if (escuderias[j].equals(esc)) {
                        pos = j;
                        break;
                    }
                }
                if (pos == -1) {
                    escuderias[contador] = esc;
                    puntos[contador] = puntosPiloto;
                    contador++;
                } else {
                    puntos[pos] += puntosPiloto;
                }
            }
        }

        System.out.println("\n--CLASIFICACIÓN POR ESCUDERÍAS--" +
                "\n-Carrera actual " + nombreCarreraActual + "-");
        for (int i = 0; i < contador; i++) {
            System.out.println(escuderias[i] + "-" + puntos[i] + "puntos");
        }
    }


}