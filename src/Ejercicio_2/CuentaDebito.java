package Ejercicio_2;

import Ejercicio_2.LogisticaBancario.Mensajes;
import Ejercicio_2.LogisticaBancario.OperacionesInternas;
import Ejercicio_2.LogisticaBancario.Validacion;
import Ejercicio_2.OperacionesBancarias.OperacionesDebito;

public class CuentaDebito extends CuentaBancaria implements OperacionesDebito {
    private double saldo;

    private CuentaDebito tarjeta;
    private OperacionesInternas tarjetaDebito;
    private Validacion validar;
    private static Mensajes aviso;

    public CuentaDebito(int numeroTarjeta, int cvv, double saldo, Usuario Persona){
        super(numeroTarjeta, cvv, Persona);
        this.saldo = saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo>=0){
            this.saldo = saldo;
        }
    }



    public void transferir(OperacionesInternas tarjetaDebito, Validacion validar, CuentaDebito tarjeta, double monto ) {

        System.out.println("Su transferencia se ha realizado con exito");
        System.out.println("Monto: "+monto);
        System.out.println("Su nuevo saldo: "+(saldo=tarjetaDebito.descontar(validar,tarjeta,monto)));

    }


    //Metodo de prueba para validar su funcionamiento
    public void pagar(OperacionesInternas tarjetaDebito, Validacion validar, CuentaDebito tarjeta, double monto ) {

        if(validar.saldoValidos(tarjeta,monto)){
            System.out.println("Pago se ha realizado con exito");
            System.out.println("Monto: "+monto);
            System.out.println("Su nuevo saldo: "+(saldo=tarjetaDebito.descontar(validar,tarjeta,monto)));

        } else{
            aviso.rechazarDebito();
        }


    }





    public void retirar(OperacionesInternas tarjetaDebito, Validacion validar, CuentaDebito tarjeta, double monto) {
        System.out.println("Usted ha realizado un retiro de: "+monto);
        System.out.println("Su nuevo saldo: "+(saldo = tarjetaDebito.descontar(validar,tarjeta,monto)));
    }





    @Override
    public void depositar(OperacionesInternas tarjetaDebito, double monto, CuentaDebito tarjeta) {

        System.out.println("Su deposito se ha realizado con exito");
        System.out.println("Monto: "+monto);
        System.out.println("Su nuevo saldo: "+(saldo=tarjetaDebito.consignar(tarjeta,monto)));
    }

    @Override
    public void consultarSaldo(CuentaDebito tarjeta) {
        System.out.println("Su saldo actual es: "+saldo);
    }


}
