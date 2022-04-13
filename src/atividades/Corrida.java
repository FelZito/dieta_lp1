package atividades;
import entidades.Atividades;

public class Corrida extends Atividades {
    private final int gastocalorico = 8;

    public Corrida() {
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Corrida:" +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}