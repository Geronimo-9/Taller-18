package Ejercicio_2;

import Ejercicio_2.LogisticaBancario.Mensajes;
import Ejercicio_2.LogisticaBancario.OperacionesInternas;
import Ejercicio_2.LogisticaBancario.Validacion;
import Ejercicio_2.OperacionesBancarias.OperacionesCredito;

public class CuentaCredito extends CuentaBancaria implements OperacionesCredito {

    private double limiteCredito = 6000000;
    private double acumulaCredito = limiteCredito;


    private OperacionesInternas tarjetaCredito;
    private Validacion validar;
    private static Mensajes aviso;



    public CuentaCredito(int numeroTarjeta, int cvv, Usuario Persona){
        super(numeroTarjeta, cvv, Persona);
        setAcumulaCredito(acumulaCredito);
        setLimiteCredito(limiteCredito);
    }


    public double getAcumulaCredito() {
        return acumulaCredito;
    }



    public double getLimiteCredito() {
        return limiteCredito;
    }



    public void setLimiteCredito(double limiteCredito) {

        if(limiteCredito>=0){
            this.limiteCredito = limiteCredito;
        }

    }
    public void setAcumulaCredito(double acumulaCredito) {

        if(acumulaCredito>=0){
            this.acumulaCredito = limiteCredito;
        }

    }



    public void transferir(CuentaCredito tarjeta, OperacionesInternas tarjetaCredito, Validacion validar , double credito) {


        if (validar.creditoValidos(tarjeta, credito)) {
            System.out.println("Pago  realizado con exito");
            System.out.println("Monto: " + credito);
            System.out.println("Su credito restante es: " + (acumulaCredito = tarjetaCredito.descontarCredito(validar, tarjeta, credito)));

        } else {
            aviso.rechazarCredito();
        }
    }

    public void pagar(CuentaCredito tarjeta, OperacionesInternas tarjetaCredito, Validacion validar, double credito) {

        if(validar.creditoValidos(tarjeta,credito)){
            System.out.println("Pago  realizado con exito");
            System.out.println("Monto: "+credito);
            System.out.println("Su credito restante es: "+ (acumulaCredito = tarjetaCredito.descontarCredito(validar,tarjeta, credito)));

        } else {
             aviso.rechazarCredito();
        }

    }


    public void retirar(CuentaCredito tarjeta, OperacionesInternas tarjetaCredito, Validacion validar, double credito) {



        if(validar.creditoValidos(tarjeta,credito)){
            System.out.println("Pago  realizado con exito");
            System.out.println("Monto: "+credito);
            System.out.println("Su credito restante es: "+ (acumulaCredito = tarjetaCredito.descontarCredito(validar,tarjeta, credito)));

        } else {
            aviso.rechazarCredito();
        }

    }


    @Override
    public void consultarDeuda(CuentaCredito tarjeta) {
        System.out.println("Su deuda actual es :"+(limiteCredito-acumulaCredito));
    }

}
