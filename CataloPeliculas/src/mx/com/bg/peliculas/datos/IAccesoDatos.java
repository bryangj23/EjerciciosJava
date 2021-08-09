package mx.com.bg.peliculas.datos;

import java.util.List;
import mx.com.bg.peliculas.domain.Pelicula;
import mx.com.bg.peliculas.exepciones.*;

public interface IAccesoDatos {
   
    boolean existe(String nombreRecurso) throws AccesoDatosEx;
    
    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;
    
    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;
    
    String buscar(String nombreRecurso, String pelicula) throws LecturaDatosEx;
    
    void crear(String nombreRecurso)throws AccesoDatosEx;
    
    void borrar(String nombreRecurso)throws AccesoDatosEx;
}
