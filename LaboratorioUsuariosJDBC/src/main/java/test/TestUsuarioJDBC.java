package test;

import datos.UsuarioDAO;
import domain.Usuario;
import java.util.List;

public class TestUsuarioJDBC {

    public static void main(String[] args) {
        
        UsuarioDAO usuarioDao = new UsuarioDAO();
        Usuario usuario = null;

        List<Usuario> usuarios = usuarioDao.selcetUsuarios();

        //Imprimiendo en pantalla los usuarios
        imprimeUsuarios(usuarios);

        //Agregando usuario
        usuario = new Usuario("miguel", "admin");
        usuarioDao.insertUsuario(usuario);

        //Actualizando usuario
        usuario = new Usuario(2, "Angela", "admin");
        usuarioDao.updateUsuario(usuario);

        //Eliminando usuario
        usuario = new Usuario(14);
        usuarioDao.deleteUsuario(usuario);

        //Imprimiendo en pantalla los usuarios
        imprimeUsuarios(usuarioDao.selcetUsuarios());
    }

    public static void imprimeUsuarios(List<Usuario> usuarios) {
        System.out.println("\n********** Lista de usuarios **********");
        for (Usuario usuario : usuarios) {
            System.out.println("usuario = " + usuario);
        }
        System.out.println("");
    }

}
