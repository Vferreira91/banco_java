package agencia;

import conta.Conta;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private int numero;
    private String endereco;
    private String telefone;
    private String gerente;
    private List<Conta> contas;

    public Agencia(int numero, String endereco, String telefone, String gerente) {
        this.numero = numero;
        this.endereco = endereco;
        this.telefone = telefone;
        this.gerente = gerente;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void removerConta(Conta conta) {
        contas.remove(conta);
    }

    public double calcularPatrimonioAgencia() {
        return contas.stream()
                .mapToDouble(Conta::getSaldo)
                .sum();
    }

    // Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGerente() {
        return gerente;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }
}
