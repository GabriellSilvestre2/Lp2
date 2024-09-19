import java.util.Scanner;
public class MainQuestão20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int tamanho = -1;

        while (tamanho < 0) {
            try {
                System.out.print("Informe Tamanho de Array: ");
                tamanho = s.nextInt();
                double[] array = new double[tamanho];
            } catch (NegativeArraySizeException e) {
                System.out.println("Tamanho de array inválido. Digite novamente!");
            }
        }

        double[] array = new double[tamanho];
        double soma = 0;

        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite " + (i + 1) + "º número: ");
            array[i] = s.nextDouble();
            soma += array[i];
        }
        System.out.println("Soma = " + soma);
    }
}

