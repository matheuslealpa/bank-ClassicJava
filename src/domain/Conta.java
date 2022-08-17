package domain;

public class Conta {
    private Long id;
    private int agencia;
    private int conta;
    private Titular titular;
    private double saldo;
    private double limite;

    public Conta(double limite){
        this.limite = limite;
    }

    public void depositar(double valor){
        this.saldo=+valor;
    }

    public boolean sacar(double valor){
        if (valor>this.saldo) return false;
        else {
            this.saldo=-valor;
            return true;
        }
    }
    public void transferir(double valor, Conta contaDestino){
        sacar(valor);
        contaDestino.depositar(valor);
    }
    public double getSaldo() {
        return saldo;
    }
}
