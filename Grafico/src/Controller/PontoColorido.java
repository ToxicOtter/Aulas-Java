package Controller;

public class PontoColorido extends Ponto {
    private String cor;
    
    public PontoColorido(int x, int y, String cor){
        super(x,y);
        this.cor = cor;
    }
    
    public void mudarCor(String nova_cor){
        this.cor = nova_cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    
    public String getCor(){
        return cor;
    }
    
    public boolean ehIgual(PontoColorido p){
        boolean igual = false;
        if((p.getX() == super.getX()) && (p.getY() == super.getY()) && (p.getCor() == cor)){
            igual = true;
        }
        return igual;
    }
}
