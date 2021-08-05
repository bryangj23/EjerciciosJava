
package mx.com.bg.mundopc;

public class Computadora {
    private int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado tecado;
    private Raton raton;
    private static int contadorCompurtadora;
    
    public Computadora(){
        this.idComputadora=Computadora.contadorCompurtadora++;
    }

    public Computadora(String nombre, Monitor monitor, Teclado tecado, Raton raton) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.tecado = tecado;
        this.raton = raton;
    }

    public int getIdComputadora() {
        return idComputadora;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTecado() {
        return tecado;
    }

    public void setTecado(Teclado tecado) {
        this.tecado = tecado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public static int getContadorCompurtadora() {
        return contadorCompurtadora;
    }

    @Override
    public String toString() {
        return "Computadora{" + "idComputadora=" + idComputadora + ", nombre=" + nombre + ", monitor=" + monitor + ", tecado=" + tecado + ", raton=" + raton + '}';
    }
    
}
