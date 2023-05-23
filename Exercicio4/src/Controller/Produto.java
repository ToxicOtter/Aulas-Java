package Controller;

public class Produto {
    public String marca;
    public String fabricante;
    public String cod_barras;
    public float preco;
    
    public Produto(){}
    public Produto(String m,String f,String c,float p){
        this.marca = m;
        this.fabricante = f;
        this.cod_barras = c;
        this.preco = p;
    }
}
