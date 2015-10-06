package apii.atividade2;

/**
 *
 * @author Fabricio
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public Pessoa(String nome, int idade, float peso, float altura){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    /**
     * @return O nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome O nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the idade
     */
    public int getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return the peso
     */
    public float getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public float calculaIMC(){
        float IMC = 0.0f;
        IMC = this.peso/ (this.altura * this.altura);
        return IMC;
    }
}
