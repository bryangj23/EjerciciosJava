package negocio;

import domain.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {

    private final List<Cuenta> cuentas = new ArrayList<>();
    private final List<Empleado> empleados = new ArrayList<>();

    public void agregarCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }

    public void agregarEmpleado(Empleado empleado) {
        this.empleados.add(empleado);
    }

    public boolean depositarCliente(int numeroCuenta, double saldo) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumeroCuenta() == numeroCuenta) {
                return cuenta.depositar(saldo);
            }
        }
        return false;
    }

    public boolean retirarCliente(int numeroCuenta, double saldo, Cliente cliente) {
        
        for (Cuenta cuenta : cuentas) {
            if ((cuenta.getCliente().getIdPersona() == cliente.getIdPersona()) && (cuenta.getNumeroCuenta() == numeroCuenta)) {
                System.out.println("Valido Cliente");
                return cuenta.retirar(saldo);
            }
        }
        return false;
    }

    public boolean retirarSueldoEmpleado(Empleado empleado, double cantidad) {
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getCliente().getIdPersona() == empleado.getIdPersona()) {
                System.out.println("Valido Empleado");
                return cuenta.retirar(cantidad);
            }
        }
        return false;
    }

    public int getVacacionesEmpleado(Empleado empleado) {
        
        for (Empleado empleado1 : empleados) {
            if(empleado1.getIdPersona()==empleado1.getIdPersona()){
                return empleado1.asignaDiasVacaciones();
            }
        }
        System.out.println(" (*) El empleado no existe");
        return 0;
    }
    
    public Empleado getEmpleado(int idEmpleado){
        for (Empleado empleado : empleados) {
            return empleado.getIdPersona()==idEmpleado ? empleado:null;
        }
        return null;
    }

}
