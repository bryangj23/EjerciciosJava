package mx.com.bg.peliculas.domain;

public class Pelicula {
    
    protected int idPelicula;
    protected String nombre;
    protected static int contadorPeliculas;
    
    public Pelicula(){
        
    }
    public Pelicula(String nombre) {
        this.idPelicula = ++Pelicula.contadorPeliculas;
        this.nombre = nombre;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static int getContadorPeliculas() {
        return contadorPeliculas;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "idPelicula=" + idPelicula + ", nombre=" + nombre + '}';
    }
    
}
