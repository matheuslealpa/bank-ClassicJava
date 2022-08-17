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

    public void deposita(double valor){
        this.saldo=+valor;
    }

    public boolean saca(double valor){
        if (valor>this.saldo) return false;
        else {
            this.saldo=-valor;
            return true;
        }
    }
    public void transferir(double valor, Conta contaDestino){
        saca(valor);
        contaDestino.deposita(valor);
    }
    public double getSaldo() {
        return saldo;
    }
}
