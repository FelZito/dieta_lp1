package atividades;

import entidades.Atividades;

public class Natacao extends Atividades {
    private final int gastocalorico = 9;

    public Natacao(){
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Natação: " +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}
