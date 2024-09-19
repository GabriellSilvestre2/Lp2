public class ContadorLentoThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++){
            System.out.println("Contagem Atual de " + getName() + ": " + i);
            try{
                Thread.sleep(5000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}