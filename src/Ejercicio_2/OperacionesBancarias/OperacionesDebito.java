package Ejercicio_2.OperacionesBancarias;

import Ejercicio_2.CuentaDebito;
import Ejercicio_2.LogisticaBancario.OperacionesInternas;

public interface OperacionesDebito {
    void consultarSaldo(CuentaDebito tarjeta);
    void depositar(OperacionesInternas tarjetaDebito, double monto, CuentaDebito tarjeta);


    }
