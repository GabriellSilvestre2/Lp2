public class ContaCorrente {
    private double saldo;
    public ContaCorrente(){
        this.saldo = 0;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean registrarDeposito(double valor){
        if (valor > 0){
            this.saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realidado.");
            return true;
        } else {
            System.out.println("Informe um valor valido para deposito.");
            return false;
        }
    }
    public boolean registrarSaque(double valor){
        double tarifa = valor * 0.005;
        if (valor > 0 && (valor + tarifa) <= this.saldo){
            this.saldo -= (valor + tarifa);
            System.out.println("Saque de R$ " + valor + " realizado. Tarifa aplicada: R$ " + tarifa);
            return true;
        } else {
            System.out.println("Saldo Insuficiente ou valor invalido");
            return false;
        }
    }
}
