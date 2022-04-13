package atividades;
import entidades.Atividades;

public class Boxe extends Atividades {
    private final int gastocalorico = 8;
    public Boxe() {
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Boxe:" +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}
