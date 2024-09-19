import java.util.Date;

public class ExemplarDetalhado extends Exemplar{
    private Date DataUltimoEmprestimo;

    public ExemplarDetalhado(int tombo, String titulo, String autoria){
        super(tombo, titulo, autoria);
        desabilitarEmprestimo();
        this.DataUltimoEmprestimo = null;
    }
    public void adicionarEmprestimo(){
        if (isHabilitacao()) {
            super.adicionarEmprestimo();
            this.DataUltimoEmprestimo = new Date();
            System.out.println("Empréstimo registrado com sucesso na data: " + DataUltimoEmprestimo);
        } else {
            System.out.println("O exemplar está desabilitado para empréstimos.");
        }
    }
    public void adicionarEmprestimo(Date data){
        if (isHabilitacao()) {
            super.adicionarEmprestimo();
            this.DataUltimoEmprestimo = data;
            System.out.println("Empréstimo registrado com sucesso na data: " + DataUltimoEmprestimo);
        } else {
            System.out.println("O exemplar está desabilitado para empréstimos.");
        }
    }
    public Date getDataUltimoEmprestimo(){
        return this.DataUltimoEmprestimo;
    }
}
