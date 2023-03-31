package Vehiculo;
import Vehiculo.Camion.Camion;
import Vehiculo.Ciclomotor.Ciclomotor;

public class Vehiculo extends MainVehiculo {

        protected String marca;
        protected double peso;
        protected int potencia;
        protected int numPuertas;
        protected double velocidad;

    public Vehiculo(String marca, double peso, int potencia, int numPuertas, double velocidad) {
        this.marca = marca;
        this.peso = peso;
        this.potencia = potencia;
        this.numPuertas = numPuertas;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar(){
        velocidad = velocidad +10;

    }
}
