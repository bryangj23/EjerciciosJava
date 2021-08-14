package test;

import domain.Cliente;
import domain.Cuenta;
import domain.CuentaHaorro;
import domain.CuentaInversion;
import domain.Empleado;
import java.util.Scanner;
import negocio.Banco;

public class ManejoBanco {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Banco banco = new Banco();

        //Creando Empleado
        Empleado empleado = new Empleado(1, 20000.0, "12/08/2012", 1, "Juan", "Gomez", "Cra95A 40s", "juan@gmail.com", 21, "32324322");
        Cliente cliente = new Cliente(2, "Juliana", "Guardo", "CRA 96B #34", "juliana@gmail.com", 20, "2332626562");

        //Creando Cuentas
        Cuenta cuentaHaorro=new CuentaHaorro(5,empleado, 1, 20000.0);
        Cuenta cuentaInversion=new CuentaInversion(cliente, 2, 2000.0);
        
        //Agregando Empleado al banco
        banco.agregarEmpleado(empleado);
        
        
        //Agregando cuentas al banco
        banco.agregarCuenta(cuentaHaorro);
        banco.agregarCuenta(cuentaInversion);
        
        //Depositando a empleado y a Cliente
        System.out.println(banco.depositarCliente(1, 3000.0));
        System.out.println(banco.depositarCliente(2, 12000.0));
        
        //Imprimiendo en pantalla los dias de vacaciones para el empleado Juan
        System.out.println("Los dias de vaciones para el empleado " + empleado.getNombre() + " son: " + banco.getVacacionesEmpleado(empleado));
        
        //Retirando sueldo Empleado
        System.out.println(banco.retirarSueldoEmpleado(empleado,10000.0) ? "Retiro Empleado exitoso":"Verifique los datos");
        
        //Retirando dinero Cliente
        System.out.println(banco.retirarCliente(2, 2000.0, cliente) ? "Retiro Cliente exitoso":"Verifique los datos");
                
    }
}
