public class ContaCorrenteEspecial extends ContaCorrente{
    public ContaCorrenteEspecial(){
        super();
    }
    @Override
    public boolean registrarSaque(double valor) {
        double tarifa = valor * 0.001;
        double valorTotal = valor + tarifa;

        if (valor > 0 && getSaldo() >= valorTotal) {
            return super.registrarSaque(valor - valor * 0.004);
        }
        return false;
    }
}
