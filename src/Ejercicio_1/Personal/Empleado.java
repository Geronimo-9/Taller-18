package Ejercicio_1.Personal;

import Ejercicio_1.TallerMantenimientos.ServicioAuditoria;
import Ejercicio_1.TallerMantenimientos.ServicioLimpieza;
import Ejercicio_1.TallerMantenimientos.ServicioMecanica;

import Ejercicio_1.Vehiculos.Vehiculo;


public abstract class Empleado {

    private int id;
    private String nombre;
    private String cargo;


    public Empleado(int id, String nombre, String cargo) {
        setId(id);
        this.nombre = nombre;
        this.cargo = cargo;
    }


    public void setId(int id) {
        if(id>=0){
            this.id = id;
        }
    }




}
