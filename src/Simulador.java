public class Simulador {
    public static void main(String[] args) {
        //Creamos los 6 coches
        Coche coche1 = new Coche("Aston Martin", 340, 0.4);
        Coche coche2 = new Coche("Aston Martin", 337, 0.5);
        Coche coche3 = new Coche("Red Bull", 380, 0.9);
        Coche coche4 = new Coche("Red Bull", 375, 0.8);
        Coche coche5 = new Coche("Mercedes", 360, 0.7);
        Coche coche6 = new Coche("Mercedes", 355, 0.6);
        //Creamos los 6 pilotos
        Piloto piloto1 = new Piloto("Fernando",44,coche1,"Excelente");
        Piloto piloto2 = new Piloto("Carlos",44,coche1,"Bueno");
        Piloto piloto3 = new Piloto("Max",44,coche1,"Mediocre");
        Piloto piloto4 = new Piloto("Colapinto",44,coche1,"Malo");
        Piloto piloto5 = new Piloto("Hamilton",44,coche1,"Bueno");
        Piloto piloto6 = new Piloto("Vettel",44,coche1,"Mediocre");


        Competicion competicion1 = new Competicion("GP de España",1);
        Competicion competicion2 = new Competicion("Gp de Bahrein", 2);

        Circuito circuito1 =  new Circuito("Barcelona", 8);
        Circuito circuito2 =  new Circuito("Madrid", 10);
        Circuito circuito3 =  new Circuito("Endurance", 11);
        Circuito circuito4 =  new Circuito("Grand Prix", 20);

        Piloto [] pilotos = {piloto1,piloto2,piloto3,piloto4,piloto5,piloto6};

        competicion1.anhadirCarrera(circuito1,8);
        competicion1.anhadirCarrera(circuito2,10);
        competicion1.anhadirCarrera(circuito3,11);
        competicion2.anhadirCarrera(circuito1,8);
        competicion2.anhadirCarrera(circuito2,10);
        competicion2.anhadirCarrera(circuito4,20);

        competicion1.arrancarCampeonato();
        competicion2.arrancarCampeonato();

        competicion1.imprimirResultado();
        competicion1.imprimirResultadoEscuderia();
        competicion2.imprimirResultado();
        competicion2.imprimirResultadoEscuderia();

    }
}
