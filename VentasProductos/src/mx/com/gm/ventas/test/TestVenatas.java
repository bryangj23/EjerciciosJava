
package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class TestVenatas {
    public static void main(String[] args) {
        
        Orden orden =new Orden();
        orden.agregarProductos(new Producto("Camiseta", 1000.0));
        orden.agregarProductos(new Producto("Lapizero", 4000.0));
        orden.agregarProductos(new Producto("Cuaderno", 4000.0));
        orden.agregarProductos(new Producto("Zapatos Nike", 4000.0));
        orden.agregarProductos(new Producto("Cocacola", 1000.0));
        orden.agregarProductos(new Producto("Silla", 4000.0));
        orden.agregarProductos(new Producto("Computadora", 4000.0));
        orden.agregarProductos(new Producto("Nevera", 4000.0));
        orden.agregarProductos(new Producto("Carro", 1000.0));
        orden.agregarProductos(new Producto("Mesa", 4000.0));
        orden.agregarProductos(new Producto("Limon", 4000.0));
        orden.agregarProductos(new Producto("Gorra", 4000.0));
        
        System.out.println(orden.calcuarTotal());
        orden.mostrarOrden();
        System.out.println(orden.getIdOrden());
    }
}
