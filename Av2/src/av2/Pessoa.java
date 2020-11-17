
package av2;

public class Pessoa implements InterfacePessoa {
    
    private String nome;
    private int idade;
    private float peso,altura;

    public Pessoa(String nome, int idade, Float altura, float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }
    
    @Override
    public void Falar(String mensagem){
        System.out.println(mensagem);
    }
    
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

    public Float getAltura() {
        return altura;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void Andar() {
        System.out.println("Andando");
    }

    

    @Override
    public void Comer() {
        System.out.println("Comendo");
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
}
