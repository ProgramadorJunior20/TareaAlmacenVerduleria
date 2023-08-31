package co.jmurillo.poo_ejemplo;

import co.jmurillo.poo_almacen.*;

public class Almacen {
    public static void main(String[] args) {
        // Crear un arreglo de productos
        Producto[] productos = new Producto[8];

        // Crear dos objetos de cada tipo de producto
        productos[0] = new Fruta("Manzana", 100.0, "Rojo", 100);
        productos[1] = new Fruta("Banana", 20.0, "Amarilla", 100);
        productos[2] = new Limpieza("Jabón", 50.0, "Liquido", 500);
        productos[3] = new Limpieza("Detergente", 60.0, "Polvo", 2000);
        productos[4] = new Lacteo("Leche", 150, 500, 5);
        productos[5] = new Lacteo("Pet", 90, 550, 8);
        productos[6] = new NoPerecible("Aceite", 10.0, 9000, 3);
        productos[7] = new NoPerecible("Arroz", 20.0, 10000, 50);

        // Imprimir detalles de los productos
        for (Producto producto : productos){
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Nombre: " + producto.getPrecio());
            // Obtener los atributos adicionales de las clases hijas
            if (producto instanceof Fruta) {
                Fruta fruta = (Fruta) producto;
                System.out.println("Color: " + fruta.getColor());
                System.out.println("Peso: " + fruta.getPeso() + " G");
            } else if (producto instanceof Limpieza){
                Limpieza limpieza = (Limpieza) producto;
                System.out.println("Componentes: " + limpieza.getComponentes());
                System.out.println("Litros: " + limpieza.getLitros());
            } else if (producto instanceof Lacteo) {
                Lacteo lacteo = (Lacteo) producto;
                System.out.println("Cantida: " + lacteo.getCantidad());
                System.out.println("Proteínas: " + lacteo.getProteinas());
            } else if (producto instanceof NoPerecible) {
                NoPerecible noPerecible = (NoPerecible) producto;
                System.out.println("Cantidad: " + noPerecible.getContenido());
                System.out.println("Calorías: " + noPerecible.getCalorias());
            }
            System.out.println("\n---------------------------");
        }

        System.out.println();

    }
}
