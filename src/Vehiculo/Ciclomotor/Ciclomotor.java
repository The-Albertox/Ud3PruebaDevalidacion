package Vehiculo.Ciclomotor;

import Vehiculo.Vehiculo;

public class Ciclomotor extends Vehiculo {

    protected boolean habilitadoParaAutopista;


    public Ciclomotor(String marca, double peso, int potencia, int numPuertas, double velocidad, boolean habilitadoParaAutopista) {
        super(marca, peso, potencia, numPuertas, velocidad);
        this.habilitadoParaAutopista = habilitadoParaAutopista;
    }


    public boolean getHabilitadoParaAutopista() {
        return habilitadoParaAutopista;
    }

    public void setHabilitadoParaAutopista(boolean habilitadoParaAutopista) {


        this.habilitadoParaAutopista = habilitadoParaAutopista;
    }





    @Override
    public void acelerar() {
        velocidad += 7;
    }

    @Override
    public String toString() {
        String mensaje = ("----------=====--------" + "\n");
        mensaje += ("tipo de vehiculo: Ciclomotor" + "\n");
        mensaje += ("marca: " + this.marca + "\n");
        mensaje += ("peso " + this.peso + "\n");
        mensaje += ("potencia " + this.potencia + " kw " + "\n");
        mensaje += ("numero de puertas " + this.numPuertas + "\n");
        mensaje += ("puede ir por autopista " + this.habilitadoParaAutopista + "\n");
        mensaje += ("la velocidad actual es de " + this.velocidad + "Km/h" + "\n");
        mensaje += ("======================================");
        return mensaje;

    }
}
