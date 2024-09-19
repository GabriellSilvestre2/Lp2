public class Main {
    public static void main(String[] args) {

        ContadorThread t1 = new ContadorThread();
        ContadorThread t2 = new ContadorThread();
        ContadorLentoThread tL1 = new ContadorLentoThread();
        ContadorLentoThread tL2 = new ContadorLentoThread();
        t1.setName("Contador Rápido 1");
        t2.setName("Contador Rápido 2");
        tL1.setName("Contador Lento 1");
        tL2.setName("Contador Lento 2");

        tL1.start();
        tL2.start();
        t1.start();
        t2.start();

    }
}
