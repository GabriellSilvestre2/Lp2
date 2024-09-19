public class ContadorThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Contagem Atual de " + getName() + ": " + i);
            try{
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
