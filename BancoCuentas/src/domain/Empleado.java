package domain;

import java.time.*;
import java.time.format.*;

public class Empleado extends Cliente{
    
    private int numeroEmpleado;
    private double sueldo;
    private String fechaEntrada;
    private String ultimaFechaVacaciones;
    
    public Empleado(int numeroEmpleado, double sueldo, String fechaentrada, int idPersona, String nombre, String apellido, String direccion, String email, int edad, String telefono) {
        super(idPersona, nombre, apellido, direccion, email, edad, telefono);
        this.numeroEmpleado = numeroEmpleado;
        this.sueldo = sueldo;
        this.fechaEntrada = fechaentrada;
    }

    public int getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(int numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }
    
    public int asignaDiasVacaciones(){
        int vacaciones=0;
        int tiempo=getTeimpoTrabajando();
        int i=1;
        
        if (ultimaFechaVacaciones==null && tiempo>1) {
            vacaciones=5;
            tiempo--;
        }
        while (tiempo>0 || vacaciones<20) {
            
            vacaciones+=2;
            tiempo--;
            i++;
            
        }
        
        return vacaciones>20 ? 20: vacaciones;
                
    }
    
    private int getTeimpoTrabajando() {
        
        String fechaAccion=fechaEntrada!= null ? fechaEntrada : ultimaFechaVacaciones;
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(fechaAccion, formatter);
        Period agnos = Period.between(fecha, LocalDate.now());
        return agnos.getYears();
    }
        
    public void setUltimaFechaVacaciones(String ultimaFechaVacaciones) {
        this.ultimaFechaVacaciones = ultimaFechaVacaciones;
    }

    public String getUltimaFechaVacaciones() {
        return ultimaFechaVacaciones;
    }
    
    
    @Override
    public String toString() {
        return "Empleado{" + "numeroEmpleado=" + numeroEmpleado + ", sueldo=" + sueldo + ", fechaentrada=" + fechaEntrada + super.toString()+'}';
    }
    
}