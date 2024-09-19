import java.util.Scanner;

public class MainFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            System.out.println("Digite o sobrenome do funcionário " + (i + 1) + ": ");
            String sobrenome = scanner.nextLine();
            System.out.println("Digite o valor por hora trabalhada do funcionário " + (i + 1) + ": ");
            double valorHora = scanner.nextDouble();
            scanner.nextLine(); // Consome o restante da linha

            funcionarios[i] = new Funcionario(nome, sobrenome, valorHora);
        }

        String opcao;

        do {
            System.out.println("\nSelecione uma das opções:");
            System.out.println("a) Acréscimo de nova quantidade de horas trabalhadas de algum dos 5 funcionários;");
            System.out.println("b) Exibição de salário líquido até o momento de cada um dos 5 funcionários;");
            System.out.println("c) Encerramento da aplicação.");
            System.out.println("Informe a opção desejada: ");
            opcao = scanner.nextLine();

            switch (opcao.toLowerCase()) {
                case "a":
                    System.out.println("Selecione o funcionário (1 a 5): ");
                    int indiceFuncionario = scanner.nextInt() - 1;
                    if (indiceFuncionario >= 0 && indiceFuncionario < 5) {
                        System.out.println("Digite a quantidade de horas a adicionar para o funcionário " + funcionarios[indiceFuncionario].getNome() + ": ");
                        int horas = scanner.nextInt();
                        funcionarios[indiceFuncionario].adicionarCargaHoraria(horas);
                        System.out.println("Horas adicionadas com sucesso!");
                    } else {
                        System.out.println("Funcionário inválido.");
                    }
                    scanner.nextLine(); // Consome o restante da linha
                    break;

                case "b":
                    System.out.println("Salários líquidos dos funcionários:");
                    for (int i = 0; i < 5; i++) {
                        Funcionario funcionario = funcionarios[i];
                        System.out.printf("%s %s: R$ %.2f%n", funcionario.getNome(), funcionario.getSobrenome(), funcionario.getSalarioLiquido());
                    }
                    break;

                case "c":
                    System.out.println("Encerrando a aplicação...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (!opcao.equalsIgnoreCase("c"));

        scanner.close();
    }
}

