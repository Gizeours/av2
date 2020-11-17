package av2;

public class Gato extends Animal{
    
    private String cor;

    public Gato(String nome, String sexo,String CorDoPelo) {
        super(nome, sexo);
        this.cor = CorDoPelo;
    }
    
    

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void FazerSom(){
        System.out.println("Miauu");
    }
    
}
