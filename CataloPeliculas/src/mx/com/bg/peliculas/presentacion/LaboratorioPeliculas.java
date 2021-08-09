package mx.com.bg.peliculas.presentacion;

import java.util.Scanner;
import mx.com.bg.peliculas.negocio.*;

public class LaboratorioPeliculas{
        
    public static void main(String[] args) {

        ICatalogoPeliculas catalogo = new CatalogoPeliculasImpl();
        String pelicula = "";
        Scanner entrada = new Scanner(System.in);

        int opcion = 0;

        do {
            System.out.println("\n#######  Bienvenido al Catalogo de Peliculas #########\n");
            System.out.println("Escoja una opcion:");
            System.out.println("1. Iniciar catalogo"
                    + "\n2. Agregar Pelicula"
                    + "\n3. Listar Peliculas"
                    + "\n4. Buscar Pelicula"
                    + "\n0. Salir"
                    + "\nOpcion: ");

            opcion = Integer.parseInt(entrada.nextLine());
            switch (opcion) {
                case 1 -> {

                    System.out.println("** Iniciando catalogo de peliculas *** ");
                    catalogo.iniciarCatalogoPeliculas();

                }

                case 2 -> {
                    System.out.println("*** Agregando pelicula ***");
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    pelicula = entrada.nextLine();
                    catalogo.agregarPelicula(pelicula);

                }

                case 3 -> {
                    System.out.println("*** Lista de peliculas ***");
                    catalogo.listarPelicula();

                }

                case 4 -> {
                    System.out.println("*** Buscando pelicula ***");
                    System.out.println("Ingrese el nombre de la pelicula a buscar: ");
                    pelicula = entrada.nextLine();
                    catalogo.buscarPelicula(pelicula);
                }

                case 0 -> {
                    System.out.println("*** !Hasta Pronto! ***");
                    System.exit(0);
                }

                default ->
                    System.out.println(" ): Opcion Incorrecta :( ");
            }
            
        } while (opcion != 0);
    }
}
