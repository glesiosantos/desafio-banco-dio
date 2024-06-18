package services.webplus.entities;

public interface Operacoes {
    void transferir(double valor, Conta destino);
    void sacar(double valor);
    void depositar(double valor);
    void imprimirExtrato();
}
