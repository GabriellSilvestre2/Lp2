/*
no qual seja indicado quantidade de formas
geométricas cujas dimensões serão informadas; em seguida, para cada forma, deverá ser indicado o tipo (retângulo,
quadrado ou círculo) e após isso, conforme tipo de forma, dimensões necessárias (todas as formas instanciadas deverão ser
armazenadas em um array que armazena objetos que implementam a interface FormaGeometrica); por fim, os métodos
de cálculo de perímetro e de área de cada um dos objetos instanciados deverão ser invocados, para fins de exibição dos
dados por ele retornados em conjunto com suas respectivas dimensões.
 */
import java.util.Scanner;

public class MainFormaGeometrica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite a quantidade de formas geometrica que serão informadas -> ");
        int quantidadeDeFormasGeometricas = s.nextInt();
        FormaGeometrica[] formas = new FormaGeometrica[quantidadeDeFormasGeometricas];

        for(int i = 0; i < quantidadeDeFormasGeometricas; i++){
            System.out.print("Escolha o tipo de forma geométrica (1- Retângulo, 2- Quadrado, 3- Círculo): ");
            int tipo = s.nextInt();

            switch (tipo){
                case 1:
                    System.out.print("Informe a base do retângulo: ");
                    double base = s.nextDouble();
                    System.out.print("Informe a altura do retângulo: ");
                    double altura = s.nextDouble();
                    formas[i] = new Retangulo(base, altura);
                    break;
                case 2:
                    System.out.print("Informe o lado do quadrado: ");
                    double lado = s.nextDouble();
                    formas[i] = new Quadrado(lado);
                    break;
                case 3:
                    System.out.print("Informe o raio do círculo: ");
                    double raio = s.nextDouble();
                    formas[i] = new Circulo(raio);
                    break;
                default:
                    System.out.println("Tipo inválido.");
                    i--;
                    break;
            }
        }
        s.close();
    }
}
