package Ejercicio_2.LogisticaBancario;

import Ejercicio_2.CuentaCredito;
import Ejercicio_2.CuentaDebito;

public class Validacion {

    public boolean creditoValidos(CuentaCredito tarjetaCredito, double credito){
        return ( credito <= tarjetaCredito.getAcumulaCredito() ) && ( tarjetaCredito.getAcumulaCredito() >=0 );
    }

    public boolean saldoValidos(CuentaDebito tarjetaDebito, double monto){
        return ( monto <= tarjetaDebito.getSaldo() ) && ( tarjetaDebito.getSaldo() >=0 );
    }








}



/*
 // Bodega de codigos que voy a implementar mas adelante.

        try{
            if(credito>limiteCredito){
                throw new IllegalArgumentException("Error, el limite para adquirir credito es de "+limiteCredito);
            }
            return credito;


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return 0;
        }

 */