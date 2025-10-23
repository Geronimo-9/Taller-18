package Ejercicio_2.LogisticaBancario;

import Ejercicio_2.CuentaCredito;
import Ejercicio_2.CuentaDebito;



public class OperacionesInternas {
    private CuentaDebito tarjetaDebito;
    private static Validacion verificar;







    public static double consignar(CuentaDebito tarjetaDebito, double monto) {


        double saldoActual = tarjetaDebito.getSaldo();
        return saldoActual += monto;



    }

    public static double descontar(Validacion verificar, CuentaDebito tarjetaDebito, double monto){

        if(verificar.saldoValidos(tarjetaDebito, monto)){
            double saldoActual = tarjetaDebito.getSaldo();
            return saldoActual = saldoActual- monto;
        } else {
            return 0;
        }

    }

    public static double descontarCredito(Validacion verificar, CuentaCredito tarjetaCredito, double monto){

        if(verificar.creditoValidos(tarjetaCredito, monto)){
            return  tarjetaCredito.getAcumulaCredito()-monto;
        } else {
            return 0;
        }

    }


    public static double deudaCredito(CuentaCredito tarjetaCredito){
        return tarjetaCredito.getLimiteCredito()-tarjetaCredito.getAcumulaCredito();
    }
















}
