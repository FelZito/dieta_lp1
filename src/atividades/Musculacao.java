package atividades;

import entidades.Atividades;

public class Musculacao extends Atividades {
    private final int gastocalorico = 5;

    public Musculacao(){
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Musculação: " +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}
