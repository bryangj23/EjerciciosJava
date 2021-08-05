
package mx.com.gm.ventas;

import java.util.ArrayList;
import java.util.List;

public class Orden {
    private final int idOrden;
    List<Producto> productos = new ArrayList<Producto>();
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS=10;

    public Orden() {
        this.idOrden=Orden.contadorOrdenes++;
    }
    
    public void agregarProductos(Producto producto){
        if(this.contadorProductos++ < Orden.MAX_PRODUCTOS){
            this.productos.add(producto);
        }else{
            System.out.println("La orden llego a su limite");
        }
    }
    
    public double calcuarTotal() {
        double precioTotal=this.productos.stream().mapToDouble(o -> o.getPrecio()).sum();
        return precioTotal;
    }

    public int getIdOrden() {
        return this.idOrden;
    }
    
    public void mostrarOrden(){
        
        System.out.println("IdOrden: "+this.idOrden
                +"\nTotal Orden: $"+this.calcuarTotal()
                +"\n");
        
//        this.productos.forEach((Producto productoss) -> {
//            System.out.println(productoss.getNombre()+":  $"+productoss.getPrecio());
//        });
        this.productos.forEach((Producto productoss) -> {
            System.out.println(productoss);
        });

        System.out.println("\nIva: 19%"
                +"\nPrecio neto: "+this.calcuarTotal()
                +"\nValor Total: "+(this.calcuarTotal()+this.calcuarTotal()*0.19));
    }
}
