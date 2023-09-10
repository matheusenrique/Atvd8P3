public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private double velocidade;

    public Carro(String marca, String modelo, int anoFabricacao, double velocidade){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.velocidade = 0;
    }

    public String getMarca() {return marca;}
    public String getModelo() {return modelo;}
    public int getAnoFabricacao() {return anoFabricacao;}
    
//Certifique-se de que a velocidade atual não seja negativa.
    public void acelerar(int acelerar){
        if(velocidade < 0){
            velocidade += acelerar;
        }
    }
    public void desacelerar(int desacelerar){
        if(velocidade > 0){
            velocidade -= desacelerar;
        }
    }
    
}
