package av2;

public class Cachorro extends Animal{
    private String CorDoPelo;

    public Cachorro(String nome, String sexo,String CorDoPelo) {
        super(nome, sexo);
        this.CorDoPelo = CorDoPelo;
    }

    public String getCorDoPelo() {
        return CorDoPelo;
    }

    public void setCorDoPelo(String CorDoPelo) {
        this.CorDoPelo = CorDoPelo;
    }
    
    public void fazerSom(){
        System.out.println("Au Au");
    }
    
    
}
