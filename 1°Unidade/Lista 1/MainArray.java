public class MainArray {
    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 6, 8, 10, 12};
        for (int i = 0; i <= 12; i++) {
            try{
            System.out.println(array[i]);
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Tentativa de acesso à índice inválido");
                return;
            }
        }
    }
}
