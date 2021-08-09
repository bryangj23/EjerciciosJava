package mx.com.bg.peliculas.datos;

import java.io.*;
import java.util.*;
import mx.com.bg.peliculas.domain.Pelicula;
import mx.com.bg.peliculas.exepciones.*;


public class AccesoDatosImpl implements IAccesoDatos{
    
    @Override
    public boolean existe(String nombreRecurso) {
        File archivo=new File(nombreRecurso);
        return archivo.exists();
        
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        var archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader lectura = new BufferedReader(new FileReader(archivo));
            var linea = lectura.readLine();
            while (linea != null) {
                peliculas.add(new Pelicula(linea));
                linea = lectura.readLine();
            }
            lectura.close();
            
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Exepcion a listar "+ex.getMessage());
        }
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        try {
            PrintWriter archivo = new PrintWriter(new FileWriter(nombreRecurso, anexar));
            archivo.println(pelicula.getNombre());
            archivo.close();
            System.out.println("Se ha escrito informacion al archivo: " +pelicula);
        } catch (FileNotFoundException ex) {
            throw new EscrituraDatosEx("Error al escribir persona"+ex.getMessage());
        } catch (IOException ex) {
            throw new EscrituraDatosEx("Error al escribir persona"+ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            BufferedReader lectura = new BufferedReader(new FileReader(archivo));
            String linea = lectura.readLine();
            int indice=1;
            while (linea != null) {
                if(buscar != null && linea.equalsIgnoreCase(buscar)){
                    resultado="Pelicula "+linea+" encontrada en el indice "+indice;
                } 
                indice++;
                linea = lectura.readLine();
            }
            lectura.close();
            
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new LecturaDatosEx("Exepcion a buscar " + ex.getMessage());
        }
        return resultado;
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        File nuevoarchivo = new File(nombreRecurso);
        try {
            var archivo = new PrintWriter(new FileWriter(nuevoarchivo));
            archivo.close();
        } catch (IOException ex) {
            throw new AccesoDatosEx("Error en el accesom a datos "+ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) {
        File archivo=new File(nombreRecurso);
        if(archivo.exists()){
            archivo.delete();
            System.out.println("Se elimino el archivo "+nombreRecurso);
        }
    }

    
    
}
