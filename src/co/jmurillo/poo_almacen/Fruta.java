package co.jmurillo.poo_almacen;

public class Fruta extends Producto{
    private double peso;
    private String color;

    public Fruta() {
        System.out.println("Fruta: Inicializando....");
    }

    public Fruta(String nombre, double precio) {
        super(nombre, precio);
    }

    public Fruta(String nombre, double precio, String color, double peso) {
        super(nombre, precio);
        this.color = color;
        this.peso = peso;

    }

    public double getPeso() {
        return peso;
    }

    public String getColor() {
        return color;
    }
}
