public class ContadorParametrizadoThread extends Thread {
    private int segundos;

    public ContadorParametrizadoThread(int segundos) {
        this.segundos = segundos;
    }

    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Contagem Atual de " + getName() + ": " + i);
            try{
                Thread.sleep(this.segundos * 1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
