package services.webplus.entities;

import lombok.Getter;

@Getter
public abstract class Conta implements Operacoes {

    private static final int AGENCIA_PADRAO = 1;
    private static final int SEQUENCIA = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

}
