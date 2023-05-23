package Model;
import Controller.Paciente;
import Controller.Produto;

public class Exercicio4 {
    public static void main(String[] args){
        Paciente p1 = new Paciente();
        p1.nome = "Luan";
        Paciente p2 = new Paciente("Luan");
        
        Produto pr1 = new Produto();
        pr1.marca = "Mondial";
        pr1.fabricante = "Mondial";
        pr1.cod_barras = "2385723967239";
        pr1.preco = 49.9F;
        Produto pr2 = new Produto("Mondial","Mondial","1257123958719358",49.9F);
        
        System.out.println(p1.nome);
        System.out.println(p2.nome);
        System.out.println(pr1.marca);
        System.out.println(pr1.marca);
    }
}
