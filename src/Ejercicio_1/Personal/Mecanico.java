package Ejercicio_1.Personal;

import Ejercicio_1.TallerMantenimientos.ServicioMecanica;
import Ejercicio_1.Vehiculos.Vehiculo;

public class Mecanico extends Empleado implements ServicioMecanica {


    public Mecanico(int id, String nombre, String cargo){
        super(id,nombre,cargo);
    }




    @Override
    public void reparar(Vehiculo vehiculo) {
        System.out.println("El Mecanico esta reparando el vehiculo");
    }

    @Override
    public void cambiar(Vehiculo vehiculo) {
        System.out.println("El Mecanico está cambiando piezas al vehiculo");
    }
}
