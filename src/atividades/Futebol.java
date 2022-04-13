package atividades;

import entidades.*;

public class Futebol extends Atividades {
    private final int gastocalorico = 6;

    public Futebol(){
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Futebol: " +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}
