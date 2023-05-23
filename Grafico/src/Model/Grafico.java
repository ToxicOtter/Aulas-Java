package Model;
import Controller.PontoColorido;

public class Grafico {
    public static void main(String[] args){
        PontoColorido p1 = new PontoColorido(10,15,"Amarelo");
        PontoColorido p2 = new PontoColorido(10,15,"Roxo");
        
        System.out.println(p1.ehIgual(p2));
    }
}
