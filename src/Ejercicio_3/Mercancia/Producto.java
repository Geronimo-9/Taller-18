package Ejercicio_3.Mercancia;

public class Producto {

        private String nombre;
        private String referencia;
        private String codigoBarra;
        private double precio;
        private static int cantidad;
        private final double iva = 0.19;


        public Producto(String nombre, String referencia, String codigoBarra, double precio, int cantidad){
            this.nombre = nombre;
            this.referencia = referencia;
            this.codigoBarra = codigoBarra;
            setPrecio(precio);
            setCantidad(cantidad);
        }

        public String getNombre() {
            return nombre;
        }

        public String getReferencia() {
            return referencia;
        }

        public String getCodigoBarra() {
            return codigoBarra;
        }

        public double getPrecio() {
            return precio;
        }

        public static int getCantidad() {
            return cantidad;
        }


        public void setPrecio(double precio) {
            if(precio >= 0){
                this.precio = precio;
            }
        }

        public void setCantidad(int cantidad) {
            if(cantidad >= 0){
                this.cantidad = cantidad;
            }
        }

    }
