package domain;

public class Cliente extends Persona{

    public Cliente() {
    }

    public Cliente(int idPersona, String nombre, String apellido, String direccion, String email, int edad, String telefono) {
        super(idPersona, nombre, apellido, direccion, email, edad,telefono);
    }

    @Override
    public String toString() {
        return "ClienteDTO{" +super.toString()+ '}';
    }
    
}

