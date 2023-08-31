package co.jmurillo.poo_almacen;

public class Producto {
    // Atributos de la clase Producto
    private String nombre;
    private double precio;

    // Inicializando constructor
    public Producto() {
        System.out.println("Producto: Inicializando......");
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Métodos Getters de los atributos
    public String getNombre(){
        return nombre;
    }

    public double getPrecio(){
        return precio;
    }

    // ToString


}
