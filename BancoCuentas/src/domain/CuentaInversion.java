package domain;

public class CuentaInversion extends Cuenta {

    private static final double LIMITECUENTA = 10000.0;
    private static final double MONTOINICIAL = 25000.0;

    public CuentaInversion(Cliente cliente, int numeroCuenta, double saldo) {
        super(cliente, numeroCuenta, saldo);
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
        System.out.println("Ingreso a retirar");
        if (monto > 0 && saldo >= LIMITECUENTA) {
            this.setSaldo(saldo);
            System.out.println("Los datos cumplen con los requisitos para retirar");
            return true;
        }
        return false;
    }

    public double CancelarCuentar() {
        double saldo = this.getSaldo();
        this.setNumeroCuenta(0);
        this.setCliente(null);
        this.setSaldo(0);

        return saldo;
    }

    @Override
    public String toString() {
        return "CuentaInversion{" + super.toString()+'}';
    }
    
    

}
