import java.util.Date;
import java.util.Scanner;

public class MainVoo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Date data = new Date();

        System.out.print("\nDigite o número do Voo -> ");
        int n = s.nextInt();
        System.out.print("Digite a quantidade de assentos -> ");
        int assentos = s.nextInt();
        Voo v1 = new Voo(n, data, assentos);
        s.nextLine();

        String opcao;
        int numeroAssento;

        do{
            System.out.println("----------------------------------------------------");
            System.out.println("Escolha alguma das opções abaixo:");
            System.out.println("a) Consulta de Disponibilidade de Assento;\n" +
                    "b) Reserva de Assento;\n" +
                    "c) Consulta da Taxa de Ocupação Atual do Voo.\n" +
                    "d) Sair do Sistema;");
            System.out.print("Digite a Opção Desejada -> ");
            opcao = s.nextLine();

            switch (opcao.toLowerCase()){
                case "a":
                    System.out.println("----------------------------------------------------");
                    try{
                        System.out.print("Digite o número do assento a ser consultado -> ");
                        numeroAssento = s.nextInt();
                        System.out.println("----------------------------------------------------");
                        System.out.println("Assento " + numeroAssento + " disponível: " + v1.isAssentoLivre(numeroAssento));
                    } catch (AssentoInexistenteException e){
                        System.out.println("----------------------------------------------------");
                        System.out.println(e.getMessage());
                    }
                    s.nextLine();
                    break;
                case "b":
                    System.out.println("----------------------------------------------------");
                    try{
                        System.out.print("Digite o número do assento a ser reservado -> ");
                        numeroAssento = s.nextInt();
                        System.out.println("----------------------------------------------------");
                        System.out.println("Assento " + numeroAssento + " Reservado: " + v1.ocuparAssento(numeroAssento));
                    }catch (AssentoInexistenteException e){
                        System.out.println("----------------------------------------------------");
                        System.out.println(e.getMessage());
                    }
                    s.nextLine();
                    break;
                case "c":
                    System.out.println("----------------------------------------------------");
                    System.out.println("Taxa de Ocupação: " + v1.getTaxaOcupacao() + "%");
                    break;
                case "d":
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("----------------------------------------------------");
                    System.out.println("Opção Invalida. Tente Novamente.");
                    break;
            }
        }while(!(opcao.equalsIgnoreCase("d")));
        s.close();
    }
}
