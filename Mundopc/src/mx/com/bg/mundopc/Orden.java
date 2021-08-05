package mx.com.bg.mundopc;

import java.util.ArrayList;
import java.util.List;

public class Orden {

    private int idOrden;
    List<Computadora> computadoras = new ArrayList<Computadora>();
    private int contadorComputadoras;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden=this.contadorComputadoras++;
    }

    public void agregarComputadoras(Computadora computadoras) {
        if(contadorComputadoras++ < Orden.MAX_COMPUTADORAS){
            this.computadoras.add(computadoras);
        }else{
            System.out.println("A completado el maximo de computadoras");
        }
    }
    
    public void mostrarOrden() {

        System.out.println("IdOrden: " + this.idOrden);

        this.computadoras.forEach((Computadora computadorass) -> {
            System.out.println(computadorass);
        });

    }

}
