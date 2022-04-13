package entidades;

public abstract class Atividades {
    private int dia, mes;
    private int gastocalorico;
    private int duracao; //Em minutos

    public void setGastocalorico(int gastocalorico) {
        this.gastocalorico = gastocalorico;
    }

    public Atividades() {

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

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }


    public int getGastocaloricoTotal(){
        return gastocalorico * getDuracao();
    }


}
