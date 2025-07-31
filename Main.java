public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("123456", "Henrique");

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(1000); // tentativa inválida
        conta.depositar(-50); // tentativa inválida

        System.out.println("Saldo atual: R$" + conta.getSaldo());
    }
}
