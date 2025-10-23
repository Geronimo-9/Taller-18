package Ejercicio_3.Vehiculos;

public abstract class Vehiculo {

    private String marca;
    private int velocidadMaxima;
    private String color;
    private String añoFabricacion;



    public Vehiculo(String marca, int velocidadMaxima, String color, String añoFabricacion){
        this.marca = marca;
        this.color = color;
        this.añoFabricacion = añoFabricacion;
        setVelocidadMaxima(velocidadMaxima);
    }


    public String getMarca() {
        return marca;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public String getAñoFabricacion() {
        return añoFabricacion;
    }

    public String getColor() {
        return color;
    }


    public void setVelocidadMaxima(int velocidadMaxima) {
        if(velocidadMaxima>=0){
            this.velocidadMaxima = velocidadMaxima;
        }
    }










}
