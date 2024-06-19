package services.webplus;

import services.webplus.entities.Cliente;
import services.webplus.entities.Conta;
import services.webplus.entities.ContaCorrente;
import services.webplus.entities.ContaPoupanca;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        
        Cliente glesio = new Cliente();
        glesio.setNome("Glêsio Santos da Silva");

        Conta cc = new ContaCorrente(glesio);
        Conta pp = new ContaPoupanca(glesio);

        cc.depositar(1000);
        cc.transferir(100, pp);
        
        pp.imprimirExtrato();
    }
}
