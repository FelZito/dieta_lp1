package atividades;

import entidades.Atividades;

public class Basquete extends Atividades {
    private final int gastocalorico = 9;

    public Basquete(){
        super();
        super.setGastocalorico(gastocalorico);
    }

    @Override
    public String toString() {
        return "Basquete: " +
                "|| Duração: " + getDuracao() + " minutos" + "||" +
                " Gasto calórico: " + getGastocaloricoTotal() + "kcal";
    }
}
