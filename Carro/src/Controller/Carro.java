package Controller;

public class Carro {
    private String marca;
    private String modelo;
    private int potencia;
    private double velocidade;
    
    public Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = 0;
        this.velocidade = 0;
    }
    public Carro(String marca, String modelo, int potencia, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.velocidade = velocidade;
    }
    
    public double obterVelocidade(){
        return velocidade;
    }
    
    public void frear(){
        if(velocidade > 0){
            if(velocidade >= 10){
                velocidade -= 10;
            } else {
                velocidade = 0;
            }
        }
    }
    
    public void acelerar(){
        velocidade += 10;
    }
    
    private void reduzir(){
        while(velocidade >=10){
            velocidade -= 10;
        }
    }
    
    public void parar(){
        if(velocidade > 0){
            if(velocidade >= 10){
                velocidade -= 10;
            } else {
                velocidade = 0;
            }
        }
    }
    
    public boolean ehIgual(Carro c){
        if(c.marca == this.marca && c.modelo == this.modelo){
            return true;
        } else {
            return false;
        }
    }
}
