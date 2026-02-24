public class Carrera {

    // Atributos
    private boolean carreraCorrida;
    private Circuito queCircuitoEs;
    private int vueltas;
    private int temporada;
    private Piloto[] piloto;
    private Piloto[] pilotoOrdenPorPuesto;

    public Carrera(Circuito queCircuitoEs, int vueltas, int temporada, Piloto[] piloto) {
        this.carreraCorrida = false;
        this.queCircuitoEs = queCircuitoEs;
        this.vueltas = vueltas;
        this.temporada = temporada;
        this.piloto = piloto;
        this.pilotoOrdenPorPuesto = new Piloto[piloto.length];
    }

    public boolean isCarreraCorrida() {
        return carreraCorrida;
    }

    public Circuito getQueCircuitoEs() {
        return queCircuitoEs;
    }

    public Piloto[] getPilotoOrdenPorPuesto() {
        return pilotoOrdenPorPuesto;
    }

    public int getTemporada() {
        return temporada;
    }

    public int getVueltas() {
        return vueltas;
    }

    public double longitudTotal() {
        return queCircuitoEs.getLongitudCircuitoKM() * vueltas;
    }

    public boolean ejecutarCarrera() {
        if (carreraCorrida) {
            System.out.println("La carrera en " + queCircuitoEs.getNombreCircuito() + " ya se ha corrido.");
            return false;
        }
        int km = (int) longitudTotal();
        double[] velocidades = new double[piloto.length];

        for (int i = 0; i < piloto.length; i++) {
            double vel = piloto[i].velocidadMedia();
            boolean acaba = piloto[i].getCoche().acabaCarrera(km);

            if (!acaba) {
                vel = 0;
            }
            velocidades[i] = vel;
            System.out.println(piloto[i].getNombre() + " va a una media de " + String.format("%.2f", vel) + " km/h");
        }
        for (int i = 0; i < piloto.length; i++) {
            pilotoOrdenPorPuesto[i] = piloto[i];
        }
        for (int i = 1; i < pilotoOrdenPorPuesto.length; i++) {
            Piloto pilotoTemp = pilotoOrdenPorPuesto[i];
            double velTemp = velocidades[i];
            int j = i - 1;
            while (j >= 0 && velocidades[j] < velTemp) {
                pilotoOrdenPorPuesto[j + 1] = pilotoOrdenPorPuesto[j];
                velocidades[j + 1] = velocidades[j];
                j--;
            }
            pilotoOrdenPorPuesto[j + 1] = pilotoTemp;
            velocidades[j + 1] = velTemp;
        }
        carreraCorrida = true;
        queCircuitoEs.anhadirCarrera(this);
        return true;
    }
}

