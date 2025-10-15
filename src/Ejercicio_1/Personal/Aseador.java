package Ejercicio_1.Personal;

import Ejercicio_1.TallerMantenimientos.ServicioLimpieza;
import Ejercicio_1.Vehiculos.Vehiculo;

public class Aseador extends Empleado implements ServicioLimpieza {


    public Aseador(int id, String nombre, String cargo){
        super(id,nombre,cargo);
    }





    @Override
    public void limpiar(Vehiculo vehiculo) {
        System.out.println("El Aseador esta limpiando el vehiculo");
    }


}
