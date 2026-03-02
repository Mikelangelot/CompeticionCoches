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

        Circuito circuito1 =  new Circuito("Barcelona", )

        Carrera carrera1 = new Carrera(1,50,6,6);
        Carrera carrera2 = new Carrera(2,48,1,6);
        Carrera carrera3 = new Carrera(3,55,1,6);


    }
}
