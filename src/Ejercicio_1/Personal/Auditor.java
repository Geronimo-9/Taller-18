package Ejercicio_1.Personal;

import Ejercicio_1.TallerMantenimientos.ServicioAuditoria;
import Ejercicio_1.Vehiculos.Vehiculo;

public class Auditor extends Empleado implements ServicioAuditoria {

    public Auditor(int id, String nombre, String cargo){
        super(id,nombre,cargo);
    }



    @Override
    public void auditar(Vehiculo vehiculo) {
            System.out.println("El Auditor esta revisando el vehiculo");
        }


    }

