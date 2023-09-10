public class ContaBancaria {
    private String nome;
    private String conta;
    private double saldo;

    public ContaBancaria(String nome, String conta, double saldo){
        this.nome = nome;
        this.conta = conta;
        this.saldo = 0;
    }
    
    public void setNome(String nome) {this.nome = nome;}
    public String getNome() {return nome;}

    public void setConta(String conta) {this.conta = conta;}
    public String getConta() {return conta;}

    public void setSaldo(double saldo) {this.saldo = saldo;}
    public double getSaldo() {return saldo;}
    
}
