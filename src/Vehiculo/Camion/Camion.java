package Vehiculo.Camion;

import Vehiculo.Vehiculo;

public class Camion extends Vehiculo {

        protected double capacidadCarga;

        public Camion(String marca, double peso, int potencia, int numPuertas, double velocidad, double capacidadCarga) {
            super(marca, peso, potencia, numPuertas, velocidad);
            this.capacidadCarga = capacidadCarga;
        }

        public double getCapacidadCarga() {
            return capacidadCarga;
        }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
        public void acelerar() {
            velocidad += 5;
        }

    @Override
    public String toString() {
        String mensaje = ("----------=====--------" + "\n");
        mensaje += ("tipo de vehiculo: Camion" + "\n");
        mensaje += ("marca: " + this.marca + "\n");
        mensaje += ("peso " + this.peso + "\n");
        mensaje += ("potencia " + this.potencia + "kw" +  "\n");
        mensaje += ("numero de puertas " + this.numPuertas + "\n");
        mensaje += ("capacidad de carga " + this.capacidadCarga + "\n");
        mensaje += ("la velocidad actual es de " + this.velocidad + " Km/h" + "\n");
        mensaje += ("======================================");
        return mensaje;
    }
}
