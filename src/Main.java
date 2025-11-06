

import Ejercicio_1.Personal.Aseador;
import Ejercicio_1.Personal.Auditor;
import Ejercicio_1.Personal.Mecanico;
import Ejercicio_1.TallerMantenimientos.ServicioAuditoria;
import Ejercicio_1.TallerMantenimientos.ServicioLimpieza;
import Ejercicio_1.TallerMantenimientos.ServicioMecanica;
import Ejercicio_1.Vehiculos.Coche;
import Ejercicio_1.Vehiculos.Vehiculo;
import Ejercicio_2.CuentaCredito;
import Ejercicio_2.CuentaDebito;
import Ejercicio_2.LogisticaBancario.OperacionesInternas;
import Ejercicio_2.LogisticaBancario.Validacion;
import Ejercicio_2.Usuario;
import Ejercicio_3.Vehiculos.Camion;
import Ejercicio_3.Vehiculos.Carro;
import Ejercicio_3.Mercancia.Producto;

public class Main {
    public static void main(String[] args) {


        //Ejercicio 1, Sistema de Mantenimiento

        ServicioMecanica MecanicaToyota = new Mecanico(23451,"Gabriel","Mecanico Automotriz");
        ServicioLimpieza AseoToyota = new Aseador(45512, "Melissa", "Auxiliar_de_Aseo");
        ServicioAuditoria AuditoriaToyota = new Auditor(12556,"Jesus","Auditor Automotriz");


        Vehiculo CocheGeronimo = new Coche("Toyota","Corolla");





        MecanicaToyota.reparar(CocheGeronimo);
        MecanicaToyota.cambiar(CocheGeronimo);
        AseoToyota.limpiar(CocheGeronimo);
        AuditoriaToyota.auditar(CocheGeronimo);


        //Ejercicio 2, Sistema de Operaciones Bancarias





        //Logistica
        OperacionesInternas Ejecucion = new OperacionesInternas();
        Validacion validar = new Validacion();


        //Usuario interactuando en la app BanCash -> (No me siento satisfecho con este mini ejercicio/proyecto U_U )

        Usuario Cliente = new Usuario("Geronimo","Mijares01",701127586);
        CuentaDebito MasterCard = new CuentaDebito(1234,600,5000, Cliente);
        CuentaCredito Visa = new CuentaCredito(4321, 654,Cliente);




        MasterCard.consultarSaldo(MasterCard);

        MasterCard.depositar(Ejecucion,5, MasterCard);

        MasterCard.depositar(Ejecucion,5, MasterCard);

        MasterCard.consultarSaldo(MasterCard);

        MasterCard.pagar(Ejecucion,validar, MasterCard,5000);

        MasterCard.pagar(Ejecucion,validar, MasterCard,10);

        MasterCard.consultarSaldo(MasterCard);

        MasterCard.pagar(Ejecucion,validar, MasterCard,10);

        MasterCard.pagar(Ejecucion,validar, MasterCard,10);

        MasterCard.pagar(Ejecucion,validar, MasterCard,10);

        MasterCard.pagar(Ejecucion,validar, MasterCard,10);






        Visa.pagar(Visa,Ejecucion,validar,6000000);


        Visa.transferir(Visa,Ejecucion,validar,1);


        Visa.retirar(Visa,Ejecucion,validar,1);







        //Ejercicio 3,Gestion de Vehiculos (Hmmmm.... OK)


        Producto mercancia = new Producto("Tocinetas","T004","77028838828",2000,4);
        Camion camion1 = new Camion("Ford",50,"Blanco","20/56/2015",1500);
        Carro carro = new Carro("Ford",150,"Amarillo","12/11/2011","Mustang");


        carro.acelerar();
        carro.frenar();

        camion1.acelerar();
        camion1.frenar();
        camion1.cargar(mercancia);










    }
}