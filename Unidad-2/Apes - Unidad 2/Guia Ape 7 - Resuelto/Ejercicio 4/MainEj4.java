class Cuenta {
    String titular;
    double saldo;

    Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    void transferir(Cuenta destino, double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo = saldo - monto;
            destino.saldo = destino.saldo + monto;

            System.out.println("Transferencia exitosa.");
        } else {
            System.out.println("Transferencia fallida: fondos insuficientes o monto invalido.");
        }
    }

    void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
    }
}

public class MainEj4 {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Carlos", 100.0);
        Cuenta cuenta2 = new Cuenta("Pedro", 50.0);

        cuenta1.transferir(cuenta2, 30.0);

        System.out.println();

        cuenta1.transferir(cuenta2, 200.0);

        System.out.println();
        cuenta1.mostrar();
        cuenta2.mostrar();
    }
}