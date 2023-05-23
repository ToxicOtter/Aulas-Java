package Controller;

public class Gerente extends Funcionario{
    private int senha;
    private int numeroDeFuncionariosGerenciados;
    
    public boolean autentica(int senha){
        if(this.senha == senha){
            System.out.println("Acesso Autorizado!");
            return true;
        } else {
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    
    public void setSenha(int senha){
        this.senha = senha;
    }
    
    public void setNumeroDeFuncionariosGerenciados(int n){
        this.numeroDeFuncionariosGerenciados = n;
    }
    
    public int getNumeroDeFuncionariosGerenciados(){
        return numeroDeFuncionariosGerenciados;
    }
}
