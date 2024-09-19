import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoUtil {
    public static void main(String[] args) {
        int x = 0, y = 0, r = 0;
        boolean inputValido;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Operação de Divisão\n");

        // Entrada do Dividendo
        do {
            System.out.print("Informe Dividendo...: ");
            try {
                x = scanner.nextInt();
                inputValido = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Informe um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
                inputValido = false;
            }
        } while (!inputValido);

        // Entrada do Divisor
        do {
            System.out.print("Informe Divisor.....: ");
            try {
                y = scanner.nextInt();
                if (y == 0) {
                    System.out.println("Erro: O divisor não pode ser zero.");
                    inputValido = false;
                } else {
                    inputValido = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro: Informe um número inteiro válido.");
                scanner.next(); // Limpa a entrada inválida
                inputValido = false;
            }
        } while (!inputValido);

        // Realiza a divisão
        try {
            r = x / y;
            System.out.println("\nResultado da Divisão: " + r);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Não é possível dividir por zero.");
        }

        scanner.close();
    }
}
/*
Identifique trechos problemáticos do método estático main que devem ser reescritos utilizando-se do tratamento de exceções
oferecido pela linguagem Java. Para cada uma das exceções passíveis de serem levantadas, o tratamento adequado consiste na
necessidade de alertar o usuário acerca do problema. Em relação à entrada de valores através do método nextInt do objeto
scanner, certifique-se de que ela seja realizada quantas vezes for necessário para se chegar à execução da operação de divisão
contida na linha 18.
 */
