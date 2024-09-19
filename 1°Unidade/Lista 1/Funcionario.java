public class Funcionario {
    private String nome;
    private String sobrenome;
    private int horasTrabalhadas;
    private double valorHoraTrabalhada;

    public Funcionario(String nome, String sobrenome, double valorHoraTrabalhada){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = 0;
        this.valorHoraTrabalhada = valorHoraTrabalhada;
    }

    public String getNome() { return nome; }
    public String getSobrenome() { return sobrenome; }
    public int getHorasTrabalhadas() { return horasTrabalhadas; }
    public double getValorHoraTrabalhada() { return valorHoraTrabalhada; }

    public void adicionarCargaHoraria(int h){
        this.horasTrabalhadas += h;
    }

    public double getSalarioLiquido(){
        double salariobruto = horasTrabalhadas * valorHoraTrabalhada;
        double deducao = 0;
        if(salariobruto <= 1212){
            deducao = salariobruto * 0.075;
        } else if(salariobruto <= 2427.35){
            deducao = (1212 * 0.075) + ((salariobruto - 1212) * 0.09);
        } else if(salariobruto < 3641.03){
            deducao = (1212 * 0.075) + ((2427.35 - 1212) * 0.09) + ((salariobruto - 2427.35) * 0.12);
        } else if(salariobruto < 7087.22){
            deducao = (1212 * 0.075) + ((2427.35 - 1212) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((salariobruto - 3641) * 0.14);
        } else{
            deducao = (1212.00 * 0.075) + ((2427.35 - 1212.00) * 0.09) + ((3641.03 - 2427.35) * 0.12) + ((7087.22 - 3641.03) * 0.14);
        }
        return salariobruto - deducao;
    }
}
