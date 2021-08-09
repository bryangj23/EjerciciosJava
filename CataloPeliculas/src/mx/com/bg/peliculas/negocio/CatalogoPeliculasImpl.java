package mx.com.bg.peliculas.negocio;

import mx.com.bg.peliculas.datos.*;
import mx.com.bg.peliculas.domain.Pelicula;
import mx.com.bg.peliculas.exepciones.*;


public class CatalogoPeliculasImpl implements ICatalogoPeliculas{

    private IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }
    
    
    @Override
    public void agregarPelicula(String nombrePelicula) {
        try {
            this.datos.escribir(new Pelicula(nombrePelicula), NOMBRE_RECURSO, this.datos.existe(NOMBRE_RECURSO));
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en el acceso a datos");
            ex.printStackTrace(System.out);
        }
    }
    
    @Override
    public void listarPelicula() {
       
        try {
           var lista=this.datos.listar(NOMBRE_RECURSO);
           for(var pelicula:lista){
               System.out.println("pelicula = " + pelicula);
           }
        } catch (LecturaDatosEx ex) {
            System.out.println("Error en el acceso a datos");
            ex.printStackTrace(System.out);
        }
            
    }

    @Override
    public void buscarPelicula(String nombrePelicula) {
        String resultado=null;
        try {
            resultado=this.datos.buscar(NOMBRE_RECURSO, nombrePelicula);
        } catch (LecturaDatosEx ex) {
            System.out.println("Error en el acceso a datos");
            ex.printStackTrace(System.out);
        }
        if (resultado != null) {
            System.out.println("resultado = " + resultado);
        }else{
            System.out.println("La peicula "+nombrePelicula+" no esta regristrada");
        }

    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                this.datos.borrar(NOMBRE_RECURSO);
                this.datos.crear(NOMBRE_RECURSO);
            }else{
                this.datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            
        }
    }
        
}
