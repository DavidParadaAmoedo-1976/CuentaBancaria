public class CuentaBancaria {
    double saldo;
//  Constructor
    public CuentaBancaria() {
        this.saldo = 0;
    }
// Getter y Setter
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double ingresarSaldo(double dinero){

        this.saldo = this.saldo + dinero;
        return this.saldo;
    }
    public double retirarDinero(double dinero){
        if (dinero < this.saldo){
            this.saldo = this.saldo - dinero;
            return this.saldo;
        } else {
            return -1;
        }
    }
}
