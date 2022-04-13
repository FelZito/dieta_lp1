package atividades;

import entidades.Atividades;

public class Ciclismo extends Atividades {
    private final int gastocalorico = 6;

    public Ciclismo(){
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Ciclismo: " +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}
