package Controller;

public class Conta {
    private int numeroConta;
    private String titular;
    protected double saldo;
    
    public Conta(int numeroConta, String titular){
        this.numeroConta = numeroConta;
        this.titular = titular;
    }
    
    public boolean depositar(float valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
        
    }
    
    public boolean sacar(float valor){
        if(valor>=this.saldo){
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean transferir(Conta contaDestino, float valor){
        boolean retirou = sacar(valor);
        
        if (retirou){
            contaDestino.depositar(valor);
            return true;
        } else {
            return false;
        }
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void gerarTaxa(){
        
    }
}
