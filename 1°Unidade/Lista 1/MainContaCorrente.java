public class MainContaCorrente {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente();
        c1.registrarDeposito(250);
        c1.registrarDeposito(0);
        c1.registrarSaque(300);
        c1.registrarSaque(200);
        System.out.println("Saldo Atual: R$ " + c1.getSaldo());
    }
}
