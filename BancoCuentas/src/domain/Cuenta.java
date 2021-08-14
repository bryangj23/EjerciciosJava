package domain;

public abstract class Cuenta {

    private Cliente cliente;
    private int numeroCuenta;
    private double saldo;
    protected boolean primerDeposito;

    public Cuenta(Cliente cliente, int numeroCuenta, double saldo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.primerDeposito = false;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo += saldo;
    }

    public abstract boolean depositar(double monto);

    public abstract boolean retirar(double monto);

    @Override
    public String toString() {
        return "CuentaDTO{" + "cliente=" + cliente + ", numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + super.toString() + '}';
    }

}
