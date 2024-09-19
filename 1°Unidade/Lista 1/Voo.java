/*
23. Considere implementação da classe Voo da forma como exigido nas questões 06 e 07. Aqui, exige-se readequação da referida
implementação em relação a alguns métodos, a saber:
• Inclusão de parâmetro adicional em método construtor, para fins de inicialização de quantidade de assentos do voo (ao
invés de estar fixado em 70 assentos, o que exigirá readequação de instrução de inicialização de array de valores
booleanos);
• Em relação ao método isAssentoLivre, lançamento de exceção em caso de tentativa de reserva de assento cujo número
é inferior a 0 (zero) ou superior à quantidade máxima de assentos do voo representado por objeto a partir do qual aquele
método é invocado;
• No tocante ao método ocuparAssento, lançamento de exceção em caso de tentativa de reserva de assento cujo número é
inferior a 0 (zero) ou superior à quantidade máxima de assentos do voo representado por objeto a partir do qual aquele
método é invocado (de acordo com especificação original, valor booleano falso deveria ser retornado nestas condições).
 */
import java.util.Date;
public class Voo {
    private boolean[] assentos;
    private int numero;
    private Date dataHorario;
    private int quantidadeDeAssentos;
    public Voo(int numero, Date dataHorario, int quantidadeDeAssentos){
        assentos = new boolean[quantidadeDeAssentos];
        this.numero = numero;
        this.dataHorario = dataHorario;
        this.quantidadeDeAssentos = quantidadeDeAssentos;
    }
    public int getQuantidadeDeAssentos(){
        return this.quantidadeDeAssentos;
    }
    public int getProximoAssentoLivre(){
        for(int i = 0; i < assentos.length; i++){
            if(!assentos[i]){
                return i+1; // Retorna o proximo assento livre
            }
        }
        return -1; // Retorma -1 se todos assentos estiverem ocupados
    }
    public boolean isAssentoLivre(int n) throws AssentoInexistenteException{
        if(n <= 0 || n > getQuantidadeDeAssentos()){
            throw new AssentoInexistenteException("Assento Invalido/Inexistente.");
        } else {
        if(assentos[n-1] == false){
            return true;
        } else {
        return false;
            }
        }
    }
    public boolean ocuparAssento(int n) throws AssentoInexistenteException{
        if(n <= 0 || n > getQuantidadeDeAssentos()){
            throw new AssentoInexistenteException("Assento Invalido/Inexistente.");
        }
        if(assentos[n-1] == false){
            assentos[n-1] = true; // Ocupa Assento
            return true;
        } else {
            return false;
        }
    }
    public int getTotalAssentosLivres(){
        int assentosOcupados = 0;
        for(int i = 0; i < assentos.length; i++){
            if(assentos[i] == true){
                assentosOcupados++;
            }
        }
        return getQuantidadeDeAssentos()-assentosOcupados;
    }
    public double getTaxaOcupacao(){
        int ocupados = getQuantidadeDeAssentos() - getTotalAssentosLivres();
        return (ocupados / (double) getQuantidadeDeAssentos()) * 100;
    }
    public int getNumero() {
        return numero;
    }
    public Date getDataHorario() {
        return dataHorario;
    }
}
