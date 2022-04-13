package entidades;

public class Atleta {
    private String nome;
    private int idade;
    private float altura, peso, gordura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getGordura() {
        return gordura;
    }

    public void setGordura(float gordura) {
        this.gordura = gordura;
    }

    public Atleta(String nome, int idade, float altura, float peso, float gordura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.gordura = gordura;

    }

    public Atleta(){

    }
    @Override
    public String toString() {
        return "===== INFORMAÇÕES DO ATLETA =====\n" +
                "Nome: " + nome + '\n' +
                "Idade: " + idade + '\n' +
                "Altura: " + altura + "m\n" +
                "Peso: " + peso + "kg \n" +
                "% de Gordura: " + gordura + "%";
    }

    public boolean validaNome(String nome) {
        //Caso tenha algum número no nome, retornará false. Caso retorne true, o nome será validado
        return nome.matches("[^\\d]+");
    }

}
