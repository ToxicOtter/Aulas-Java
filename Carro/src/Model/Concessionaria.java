package Model;
import Controller.Carro;

public class Concessionaria{
    public static void main(String[] args){
        Carro car1 = new Carro("Chevrolet","Onix");
        Carro car2 = new Carro("Chevrolet","Onix", 100,40.2);
        
        System.out.print(car1.ehIgual(car2));
    }
}