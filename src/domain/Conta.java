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
        this.saldo.add(BigDecimal.ZERO);
        this.limite = limite;
    }

    public void deposita(BigDecimal valor){
        saldo.add(valor);
    }

    public void saca(BigDecimal valor){
        if (this.saldo.doubleValue() >= valor.doubleValue()){
        	this.saldo.subtract(valor);
        }else{
            throw new IllegalArgumentException("O valor solicitado não está disponível em sua conta");
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
