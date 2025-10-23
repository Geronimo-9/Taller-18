package Ejercicio_3;

import Ejercicio_3.AccionesVehiculos.Cargamento;
import Ejercicio_3.AccionesVehiculos.Conduccion;
import Ejercicio_3.Mercancia.Producto;

public class Camion extends  Vehiculo implements Conduccion, Cargamento {
    private int capacidadCarga;


    public Camion(String marca, int velocidadMaxima, String color, String añoFabricacion, int capacidadCarga){
        super(marca, velocidadMaxima, color, añoFabricacion);
        setCapacidadCarga(capacidadCarga);
    }


    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        if(capacidadCarga>0){
            this.capacidadCarga = capacidadCarga;
        }
    }

    @Override
    public void acelerar() {
        System.out.println("El camion acelera");
    }

    @Override
    public void frenar() {
        System.out.println("El camion frena");
    }

    @Override
    public void cargar(Producto mercancia) {
        System.out.println("se esta transportando "+ Producto.getCantidad()+" Mercancias");
    }



}
