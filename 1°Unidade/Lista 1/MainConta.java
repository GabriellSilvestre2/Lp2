
import java.util.Scanner;
public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor;

        System.out.print("\nInforme o Saldo Mínimo para sua Conta -> ");
        valor = scanner.nextDouble();
        Conta conta = new Conta(valor);
        scanner.nextLine();

        int opcao;

        do {
            System.out.println("\n------- Opções -------");
            System.out.println("1 - Deposito");
            System.out.println("2 - Saque");
            System.out.println("3 - Sair");
            System.out.print("\nInforme a opção desejada -> ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("\nInforme o valor do Depósito -> ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    scanner.nextLine();
                    break;
                case 2:
                    boolean saqueValido;
                    do {
                        System.out.print("\nInforme o valor do Saque -> ");
                        valor = scanner.nextDouble();
                        try {
                            conta.sacar(valor);
                            saqueValido = true;
                        } catch (SaldoInsuficienteException e) {
                            System.out.println(e.getMessage());
                            saqueValido = false;
                        }
                        scanner.nextLine();
                    } while (!saqueValido);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção Invalida. Digite novamente.");
                    break;
            }
        }while(!(opcao == 3));

        System.out.println("\nSaldo Final    : " + conta.getSaldo());
        System.out.println("Total de Tributos: " + conta.calcularTributos());
        scanner.close();
    }
}
