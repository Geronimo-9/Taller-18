package Ejercicio_2;

public class Usuario {
    private String nombre;
    private String clave;
    private int id;

    public Usuario(String nombre, String clave, int id){
        this.nombre = nombre;
        this.clave = clave;
        setId(id);
    }


    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>=0){
            this.id = id;
        }
    }







}
