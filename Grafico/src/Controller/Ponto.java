package Controller;

public class Ponto {
    private int x;
    private int y;
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void mover(int novo_x,int novo_y){
        this.x = novo_x;
        this.y = novo_y;
    }
    
    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.x = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void mostrarCoordenadas(){
        System.out.println("x = "+x+", "+"y = "+y);
    }
    
    public boolean verificarEhIgual(Ponto p){
        boolean eh_igual = false;
        if((x == p.getX()) && (y == p.getY())){
            eh_igual = true;
        }
        return eh_igual;
    }
}
