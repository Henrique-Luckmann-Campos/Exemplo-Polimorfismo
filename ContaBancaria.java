public class ContaBancaria {
    // Atributos privados (encapsulados)
    private String numeroConta;
    private String titular;
    private double saldo;

    // inicializar número da conta e titular
    public ContaBancaria(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0; // saldo inicia em zero
    }

    // depositar valores na conta
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            System.out.println("Depósito inválido: o valor deve ser maior que zero.");
            return false;
        }
    }

    // Metodo publico para sacar valores da conta
    public boolean sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            System.out.println("Saque inválido: valor maior que o saldo ou valor negativo.");
            return false; //usa boolean, pois dá como verdadeiro ou falso
        }
    }

    // Metodo publico para consultar o saldo
    public double getSaldo() {
        return saldo;
    } // usa double, pois irá aparecer um número com vírgulas, saindo os centavos também

}
