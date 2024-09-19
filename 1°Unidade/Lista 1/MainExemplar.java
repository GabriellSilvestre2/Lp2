import java.util.Scanner;
public class MainExemplar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Exemplar[] exemplares = new Exemplar[6];
        System.out.println("- Informe os dados de 6 exemplares abaixo:");
        for(int i = 0; i < 6; i++){
            System.out.println((i+1) + "° exemplar:");
            System.out.print("Número do tombo -> ");
            int tombo = s.nextInt();
            s.nextLine();
            System.out.print("Título -> ");
            String titulo = s.nextLine();
            System.out.print("Autoria -> ");
            String autoria = s.nextLine();
            exemplares[i] = new Exemplar(tombo, titulo, autoria);
        }
        String opcao;
        int contadorDeEmprestimos = 0;
        do{
            System.out.println("- Escolha alguma opção abaixo:");
            System.out.println("a) Habilitar algum dos exemplares para empréstimos;\n" +
                    "b) Desabilitar algum dos exemplares para empréstimos;\n" +
                    "c) Registrar novo empréstimo de algum dos exemplares;\n" +
                    "d) Exibição de total de empréstimos de todos os exemplares;\n" +
                    "e) Exibição de título e autoria do exemplar com maior quantidade de empréstimos;\n" +
                    "f) Encerramento da aplicação.");
            System.out.print("Opcão deseja -> ");
            opcao = s.nextLine();

                    switch (opcao.toLowerCase()) {
                case "a":
                    System.out.print("Informe qual dos exemplares você deseja HABILITAR (1 a 6) -> ");
                    int i = s.nextInt()-1;
                    s.nextLine();
                    if(!exemplares[i].isHabilitacao()){
                    exemplares[i].habilitarEmprestimo();
                        System.out.println("Exemplar " + exemplares[i].getTombo() + " HABILITADO para emprestimo com sucesso.");
                    } else{
                        System.out.println("Exemplar " + exemplares[i].getTombo() + "já se encontrava HABILITADO para emprestimo.");
                    }
                    break;

                case "b":
                    System.out.print("Informe qual dos exemplares você deseja DESABILITAR (1 a 6) -> ");
                    int y = s.nextInt()-1;
                    s.nextLine();
                    if(exemplares[y].isHabilitacao()){
                        exemplares[y].desabilitarEmprestimo();
                        System.out.println("Exemplar " + exemplares[y].getTombo() + " desabilitado para DESABILITADO.");
                    } else{
                        System.out.println("Exemplar " + exemplares[y].getTombo() + " já se encontrava DESABILITADO para emprestimo.");
                    }
                    break;

                case "c":
                    System.out.print("Informe qual dos exemplares você deseja registrar emprestimo (1 a 6) -> ");
                    int e = s.nextInt()-1;
                    s.nextLine();
                    if(exemplares[e].isHabilitacao()){
                    exemplares[e].adicionarEmprestimo();
                    contadorDeEmprestimos++;
                    System.out.println("Empréstimo registrado.");
                    } else {
                        System.out.println("O exemplar " + exemplares[e].getTombo() + " se encontra DESABILITADO para emprestismo.");
                    }
                    break;

                case "d":
                    System.out.println("Total de Empréstimos Realizados -> " + contadorDeEmprestimos);
                    break;

                case "e":
                    Exemplar maior = exemplares[0];
                    for(int c = 0; c < exemplares.length; c++){
                        if(exemplares[c].getEmprestimos() > maior.getEmprestimos()){
                            maior = exemplares[c];
                        }
                    }
                    System.out.println("Exemplar com maior quantidade de emprestimos:");
                    System.out.println("Título: " + maior.getTitulo());
                    System.out.println("Autoria: " + maior.getAutoria());

                    break;

                case "f":
                    System.out.println("Encerrando Aplicação...");
                    break;

                default:
                    System.out.println("***** Opção inválida. Tente Novamente *****");
                    break;
            }
        } while(!(opcao.equalsIgnoreCase("f")));
        s.close();
    }
}
