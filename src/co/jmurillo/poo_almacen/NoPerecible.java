package co.jmurillo.poo_almacen;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible(){
        System.out.println("NoPerecible: Inicializando.....");
    }

    public NoPerecible(String nombre, double precio){
        super(nombre, precio);
    }

    public NoPerecible(String nombre, double precio, int contenido, int calorias){
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido(){
        return contenido;
    }

    public int getCalorias(){
        return calorias;
    }
}
