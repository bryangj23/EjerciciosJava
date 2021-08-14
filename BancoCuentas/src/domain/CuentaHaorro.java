package domain;

public class CuentaHaorro extends Cuenta {

    private static final double MONTOINICIAL = 1000.0;
    private static final double LIMITECUENTA = 500.0;
    private double porcentajeAhorroaAnual;

    public CuentaHaorro(double porcentajeAhorroaAnual, Cliente cliente, int numeroCuenta, double saldo) {
        super(cliente, numeroCuenta, saldo);
        this.porcentajeAhorroaAnual = porcentajeAhorroaAnual;
    }
    
    @Override
    public boolean depositar(double monto) {
        double saldo = this.getSaldo() + monto;
        if (primerDeposito && monto > MONTOINICIAL) {
            this.setSaldo(saldo);
            primerDeposito=false;
            return true;
        } else if (monto > 0) {
            this.setSaldo(saldo);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean retirar(double monto) {
        double saldo = this.getSaldo() - monto;
        if (monto > 0 && saldo >= LIMITECUENTA) {
            this.setSaldo(saldo);
            System.out.println("Los datos cumplen con los requisitos para retirar");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "CuentaHaorro{" + "porcentajeAhorroaAnual=" + porcentajeAhorroaAnual + super.toString()+ '}';
    }
    
    

}
