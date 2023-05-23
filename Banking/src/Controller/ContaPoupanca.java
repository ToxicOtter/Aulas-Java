package Controller;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(int numeroConta, String titular){
        super(numeroConta, titular);
    }
    public void gerarTaxa(){
        saldo += saldo * .006;
    }
}
