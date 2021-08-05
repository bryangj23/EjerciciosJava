package mx.com.bg.mundopc;

public class Teclado extends DispositivoEntrada{
    
    private int idTeclado;
    private static int contadorTeclados;

    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = Teclado.contadorTeclados++;
    }

    public int getIdTeclado() {
        return idTeclado;
    }

    public static int getContadorTeclados() {
        return contadorTeclados;
    }

    @Override
    public String toString() {
        return "Teclado{" + "idTeclado=" + idTeclado + '}';
    }
    
}
