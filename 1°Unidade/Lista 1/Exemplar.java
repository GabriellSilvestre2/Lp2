public class Exemplar {
    private int tombo;
    private String titulo;
    private String autoria;
    private boolean habilitacao;
    private int emprestimos;

    public Exemplar(int tombo, String tituloObra, String autores){
        this.tombo = tombo;
        this.titulo = tituloObra;
        this.autoria = autores;
        this.habilitacao = false;
        this.emprestimos = 0;
    }
    public int getTombo() {
        return tombo;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutoria() {
        return autoria;
    }
    public boolean isHabilitacao() {
        return habilitacao;
    }
    public int getEmprestimos() {
        return emprestimos;
    }
    public void habilitarEmprestimo(){
        this.habilitacao = true;
    }
    public void desabilitarEmprestimo(){
        this.habilitacao = false;
    }
    public void adicionarEmprestimo(){
        this.emprestimos++;
    }
}
