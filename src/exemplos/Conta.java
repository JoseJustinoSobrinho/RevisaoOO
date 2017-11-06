package exemplos;

public abstract class Conta implements Comparable<Conta>{

    private int agencia;
    private int conta;
    private Pessoa titular;
    private double saldo;

    public Conta() {
    }

    public Conta(int agencia, int conta, Pessoa titular) {
        this.agencia = agencia;
        this.conta = conta;
        this.titular = titular;
    }

    public Pessoa getTitular() {
        return titular;
    }

    public void setTitular(Pessoa titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void sacar(double valor){
        if (valor > saldo ){
            throw new RuntimeException("Valor maior de saldo disponível");
        } else {
//        this.saldo = this.saldo - valor;
          this.saldo -= valor;
        }     
    }
    
    public void depositar(double valor){
        if(valor < 0 ){
             throw new RuntimeException("Valor não pode ser menor que 0,00");
        } else {
            this.saldo += valor;
        }        
    }
    
    public void transferir(double valor, Conta conta){
        this.sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public String toString() {
        return "Conta{" + "agencia=" + agencia + ", conta=" + conta + ", titular=" + titular + ", saldo=" + saldo + '}';
    }

    @Override
    public int hashCode() {   // hascCode usa nos conuntos e não lista
        int hash = 5;
        hash = 89 * hash + this.agencia;
        hash = 89 * hash + this.conta;
        return hash;
    }
    
    
    
    @Override
    public boolean equals(Object obj) {
    Conta c1 = this;
    Conta c2 = (Conta) obj;
    return (c1.conta == c2.conta && c1.agencia == c2.agencia);
    }
    
    @Override
    public int compareTo(Conta conta) {
    if(this.agencia > conta.agencia){
        return +1;
    } else if (this.agencia < conta.agencia){
        return -1;
    } else {
        return 0;
    }
    }
    
}
