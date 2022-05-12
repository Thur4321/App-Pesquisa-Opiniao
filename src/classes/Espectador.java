package classes;

public class Espectador {

    //Atributos
    private byte idade;
    private char opiniao;
    
    // Construtores sobrecarregados
     public Espectador(byte idade, char opiniao) {
        this.idade = idade;
        this.opiniao = opiniao;
    }

    public Espectador() {
    }

    //Métodos

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public char getOpiniao() {
        return opiniao;
    }

    public void setOpiniao(char opiniao) {
        this.opiniao = opiniao;
    }
    
    
}
