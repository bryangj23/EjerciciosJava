package mx.com.bg.mundopc;

public class Monitor {
    private int idMonitor;
    private String marca;
    private String tamano;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = Monitor.contadorMonitores++;
    }
    
    public Monitor(String marca, String tamano) {
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public int getIdMonitor() {
        return idMonitor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public static int getContadorMonitores() {
        return contadorMonitores;
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamano=" + tamano + '}';
    }
    
}
