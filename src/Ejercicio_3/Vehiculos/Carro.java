package Ejercicio_3.Vehiculos;

import Ejercicio_3.AccionesVehiculos.Conduccion;

public class Carro extends Vehiculo implements Conduccion {
    private String modelo;

    public Carro(String marca, int velocidadMaxima, String color, String añoFabricacion, String modelo){
        super(marca, velocidadMaxima, color, añoFabricacion);
        this.modelo = modelo;
    }




    @Override
    public void frenar() {
        System.out.println("el coche esta frenando");
    }

    @Override
    public void acelerar() {
        System.out.println("EL coche comenzó a marchar");
    }




}
