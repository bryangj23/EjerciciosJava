package mundoPc;

import mx.com.bg.mundopc.*;

public class MundoPc {
    
    public static void main(String[] args) {
        
        Orden ordencompra=new Orden();
        
        ordencompra.agregarComputadoras(new Computadora("Hp", new Monitor("Samsums", "1000x7000"), 
                new Teclado("USB", "NIA"), new Raton("USB", "Original")));
        
        ordencompra.mostrarOrden();
    }
}
