package mx.com.bg.mundopc;

public class Raton extends DispositivoEntrada{
    
    private int idRaton;
    private static int contadorRaton;

    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idRaton = Raton.contadorRaton++;
    }

    public int getIdRaton() {
        return idRaton;
    }

    public static int getContadorRaton() {
        return contadorRaton;
    }
    
    @Override
    public String toString() {
        return "Raton{" + "idRaton=" + idRaton + '}';
    }
    
}
