public class Conta implements Tributavel{
    private double saldo;
    private double saldoMinimo;
    private double tributos;
    public Conta(double saldoMinimo) {
        this.tributos = 0;
        this.saldo = 0;
        this.saldoMinimo = saldoMinimo;
    }
    public double getSaldoMinimo() {return saldoMinimo;}

    public void setSaldoMinimo(double saldoMinimo) {this.saldoMinimo = saldoMinimo;}

    public double getSaldo() {return saldo;}

    public void depositar(double deposito) {
        double taxa = 0.01;
        saldo += deposito-(deposito*taxa);
        this.tributos = this.tributos + (deposito*taxa);
    }

    public void sacar(double saque) throws SaldoInsuficienteException {
        double taxa = 0.01;
        double saldoPosDebitacao = (saldo-(saque+(saque*taxa)));
        if(saldoPosDebitacao >= saldoMinimo){
        saldo -= (saque+(saque*taxa));
        this.tributos = this.tributos + (saque*taxa);
        } else{
            throw new SaldoInsuficienteException("\"O valor desse saque resultará em um saldo inferior ao saldo mínimo definido para a conta.\"");
        }
    }
    @Override
    public double calcularTributos() {
        return this.tributos;
    }
}
