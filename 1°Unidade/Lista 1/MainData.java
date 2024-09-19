import java.util.Scanner;
public class MainData{
    public static void main(String[] args) throws DataIncorretaException{
        Scanner s = new Scanner(System.in);
        int dia=-1, mes=-1, ano=-1;
        boolean dataValida = false;

        do{
            try{
                System.out.print("Informe o dia: ");
                dia = s.nextInt();
                System.out.print("Informe o mês: ");
                mes = s.nextInt();
                System.out.print("Informe o ano: ");
                ano = s.nextInt();
                Data data = new Data(dia, mes, ano);
                dataValida = true;
                System.out.println("Data: " + data.mostrarData());
                System.out.println("Dias restantes para o final do ano: " + data.getDiasTerminoAno());
                dataValida = true;
            }catch(DataIncorretaException e){
                System.out.println(e.getMessage());
            }
        }while(!dataValida);

        s.close();

    }
}