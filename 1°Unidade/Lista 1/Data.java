public class Data {
    private int dia;
    private int mes;
    private int ano;
    public Data(int dia, int mes, int ano) throws DataIncorretaException {
        if (ano < 0 || ano > 9999) {
            throw new DataIncorretaException("Ano inválido. Deve ser positivo e ter até 4 dígitos.");
        }
        if (mes < 1 || mes > 12) {
            throw new DataIncorretaException("Mês inválido. Deve estar entre 1 e 12.");
        }
        if (dia < 1 || dia > 31) {
            throw new DataIncorretaException("Dia inválido. Deve estar entre 1 e 31.");
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    public int getDia() {
        return dia;
    }
    public void setDia(int dia) {
        this.dia = dia;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String mostrarData(){
        return (dia < 10 ? "0" : "") + dia + "/" + (mes < 10 ? "0" : "") + mes + "/" + ano;
    }
    public int getDiasTerminoAno() {
        int diasRestantes = (12 - mes) * 30 + (30 - dia);
        return diasRestantes;
    }
}