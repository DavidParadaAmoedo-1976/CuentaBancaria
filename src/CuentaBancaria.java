public class CuentaBancaria {
    double saldo;
//  Constructor
    public CuentaBancaria(double saldo) {
        this.saldo = 0;
    }
// Getter y Setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double ingresarSaldo(){
        double ingreso = 0;
        this.saldo = this.saldo + ingreso;
        return this.saldo;
    }
}
