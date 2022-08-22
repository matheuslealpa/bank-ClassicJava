package domain;

import java.math.BigDecimal;

public abstract class Conta {
    private Long id;
    private int agencia;
    private int conta;
    private Titular titular;
    private BigDecimal saldo;
    private BigDecimal limite;

    public Conta(BigDecimal limite){
        this.limite = limite;
    }

    public void deposita(BigDecimal valor){
        BigDecimal deposito = valor;
        saldo.add(deposito);
    }

    public void saca(BigDecimal valor){
        if (this.saldo.add(this.limite).doubleValue() >= valor.doubleValue()){
        	this.saldo.subtract(valor);
        }else{
            throw new IllegalArgumentException("CLiente sem limite disponível");
        }
    }
    public void transferir(BigDecimal valor, Conta contaDestino){
        saca(valor);
        contaDestino.deposita(valor);
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
}
