package teste;

import banco.Banco;
import agencia.Agencia;
import conta.Conta;

public class TesteSistemaBancario {
    public static void main(String[] args) {
        // Criando um banco
        Banco banco = new Banco("Banco Veiga", "98.342.171/0001-00", 123);

        // Criando agências
        Agencia agencia1 = new Agencia(1, "Rua Ibituruna, 123", "(21)2758-3892", "José das Couves");
        Agencia agencia2 = new Agencia(2, "Rua Buenos Aires, 44", "(21)2171-6969", "Wagner Domingues Costa");

        // Adicionando agências ao banco
        banco.adicionarAgencia(agencia1);
        banco.adicionarAgencia(agencia2);

        // Criando contas
        Conta conta1 = new Conta(1001, "Adeíldo Silveira", 1000.0, "Corrente");
        Conta conta2 = new Conta(1002, "Jeremias José do Nascimento", 2000.0, "Poupança");
        Conta conta3 = new Conta(2001, "Pedro Souza", 1500.0, "Corrente");

        // Adicionando contas às agências
        agencia1.adicionarConta(conta1);
        agencia1.adicionarConta(conta2);
        agencia2.adicionarConta(conta3);

        // Testando operações
        System.out.println("Saldo inicial da conta 1: " + conta1.getSaldo());
        conta1.depositar(500.0);
        System.out.println("Saldo após depósito: " + conta1.getSaldo());
        conta1.sacar(200.0);
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        System.out.println("Saldo inicial da conta 2: " + conta2.getSaldo());
        conta1.transferir(conta2, 300.0);
        System.out.println("Saldo da conta 1 após transferência: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 após transferência: " + conta2.getSaldo());

        // Calculando patrimônio total do banco
        System.out.println("Patrimônio total do banco: " + banco.calcularPatrimonioTotal());
    }
}