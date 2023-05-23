package Controller;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private RG rg;
    
    public abstract void falar(String fala);
    public abstract void mostradDados();
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    } 
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public void setRg(RG rg){
        this.rg = rg;
    }
    
    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public char getSexo(){
        return sexo;
    }
    public RG getRg(){
        return rg;
    }
}
