package mx.com.bg.peliculas.negocio;

public interface ICatalogoPeliculas {

    String NOMBRE_RECURSO = "pelicula.txt";

    void agregarPelicula(String nombrePelicula);
    
    void listarPelicula();
    
    void buscarPelicula(String nombrePelicula);
    
    void iniciarCatalogoPeliculas();

}
