package Vehiculo;
import Vehiculo.Camion.Camion;
import Vehiculo.Ciclomotor.Ciclomotor;
import Vehiculo.Vehiculo;

public class MainVehiculo {
    public static void main(String[] args) {

        Ciclomotor pepe = new Ciclomotor("gg", 2.2, 4, 0, 5.6, true);
        pepe.acelerar();
        System.out.println(pepe);

        Camion juan = new Camion("juan", 2.2, 4 , 3, 6.6, 6.5);
        juan.acelerar();
        System.out.println(juan);


    }

}
