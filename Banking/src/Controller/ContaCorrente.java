package Controller;

public class ContaCorrente extends Conta {
    public ContaCorrente(int numeroConta, String titular){
        super(numeroConta,titular);
    }
    
    @Override
    public void gerarTaxa(){
        saldo -= 15.90;
    }
}
