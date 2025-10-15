

import Ejercicio_1.Personal.Aseador;
import Ejercicio_1.Personal.Auditor;
import Ejercicio_1.Personal.Empleado;
import Ejercicio_1.Personal.Mecanico;
import Ejercicio_1.TallerMantenimientos.ServicioAuditoria;
import Ejercicio_1.TallerMantenimientos.ServicioLimpieza;
import Ejercicio_1.TallerMantenimientos.ServicioMecanica;
import Ejercicio_1.Vehiculos.Coche;
import Ejercicio_1.Vehiculos.Vehiculo;

public class Main {
    public static void main(String[] args) {


        //Ejercicio 1, Sistema de Mantenimiento

        ServicioMecanica MecanicaToyota = new Mecanico(23451,"Gabriel","MecanicoAutomotriz");
        ServicioLimpieza AseoToyota = new Aseador(45512, "Melissa", "Auxiliar_de_Aseo");
        ServicioAuditoria AuditoriaToyota = new Auditor(12556,"Jesus","Auditor Automotriz");


        Vehiculo CocheGeronimo = new Coche("Toyota","Corolla");




        MecanicaToyota.reparar(CocheGeronimo);
        MecanicaToyota.cambiar(CocheGeronimo);
        AseoToyota.limpiar(CocheGeronimo);
        AuditoriaToyota.auditar(CocheGeronimo);





    }
}