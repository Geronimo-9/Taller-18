package Ejercicio_2;

public abstract class CuentaBancaria {
    private int numeroTarjeta;
    private int cvv;
    private Usuario Persona;


    public CuentaBancaria(int numeroTarjeta, int cvv, Usuario Persona){
        setNumeroTarjeta(numeroTarjeta);
        setCvv(cvv);
        this.Persona = Persona;
    }




    public int getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public int getCvv() {
        return cvv;
    }

    public void setNumeroTarjeta(int numeroTarjeta) {
        if (numeroTarjeta>=0){
            this.numeroTarjeta = numeroTarjeta;
        }
    }

    public void setCvv(int cvv) {
        if(cvv>00){
            this.cvv = cvv;
        }
    }

    public void pagar(double monto){
        System.out.println("pago realizado");
    }


    public void transferir(double monto){
        System.out.println("transferencia exitosa");
    }

    public void retirar(double monto){
        System.out.println("retiro exitoso");
    }





}
